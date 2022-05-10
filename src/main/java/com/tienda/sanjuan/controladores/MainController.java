/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tienda.sanjuan.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author carop
 */
@Controller
@RequestMapping("")
public class MainController {
    @GetMapping("")
    public String index(){
	return "index";
    }
    
    @GetMapping("/about")
    public String conocenos(){
        return "about";
    }
}