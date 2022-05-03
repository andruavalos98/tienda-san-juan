
package com.tienda.sanjuan.controladores;


import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;

import com.tienda.sanjuan.entidades.Detalle;
import com.tienda.sanjuan.entidades.Orden;
import com.tienda.sanjuan.entidades.Usuario;
import com.tienda.sanjuan.servicios.DetalleServicio;
import com.tienda.sanjuan.servicios.OrdenServicio;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/orden")
public class OrdenController {
    @Autowired
    private OrdenServicio ordenServicio;

    @Autowired
    private DetalleServicio detalleServicio;


    @GetMapping("/checkout")
    public String checkout(Model modelo, HttpSession session) {
        /* ------agregar al modelo una entidad (Metodo de pago) vacio
            -----y rellenar la direccion del usuario y el detalle de la compra*/

            ArrayList<Detalle> carrito = (ArrayList<Detalle>) session.getAttribute("carrito");
            Usuario usuario = (Usuario) session.getAttribute("usuario");
            modelo.addAttribute("carrito", carrito);

        return "checkout";
    }

    @PostMapping("/hacerPedido")
    public String hacerPedido(Model modelo, HttpSession session) {
        // --------se genera la orden y se la persiste
        ArrayList<Detalle> carrito = (ArrayList<Detalle>) session.getAttribute("carrito");
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        Double total=0.0;
        for (Detalle item : carrito) {
            total += item.getSubTotal();
        }
        try {
            Orden orden = new Orden();
            //SimpleDateFormat parseador = new SimpleDateFormat("yyyy-MM-dd");
            orden.setPurchaseDate(new Date());
            orden.setUser(usuario);
            orden.setTotal(total);
            orden = ordenServicio.guardar(orden);
            for (Detalle item : carrito) {
                item.setOrden(orden);
                detalleServicio.guardar(item);
                ordenServicio.descontarStock(item.getArticulo().getId(), item.getQuantity());
            }        
            session.removeAttribute("carrito");
            modelo.addAttribute("succes", "Orden Generada");     
            return "confirmation";       
        } catch (Exception e) {
            e.printStackTrace();
            modelo.addAttribute("error", "No se pudo hacer la compra.");
            return "confirmation";//------ deberia devolver a una pagina de error
        }
    }

    @GetMapping("/listar")
    public String listar(Model modelo, @RequestParam("idUsuario") String idUsuario) {
        // ---- listar las ordenes por el id del usuario
        //ArrayList<Orden> ordenes = ordenServicio.buscarPorUsuario(idUsuario);
        //modelo.addAttribute("listaOrdenes", ordenes);
        return "order";
    }
}
