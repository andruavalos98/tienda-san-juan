package com.tienda.sanjuan.entidades;

import com.tienda.sanjuan.entidades.Orden;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2022-04-21T21:51:01")
@StaticMetamodel(DetalleOrden.class)
public class DetalleOrden_ { 

    public static volatile SingularAttribute<DetalleOrden, Double> total;
    public static volatile SingularAttribute<DetalleOrden, Integer> quantity;
    public static volatile SingularAttribute<DetalleOrden, String> id;
    public static volatile SingularAttribute<DetalleOrden, Orden> orden;

}