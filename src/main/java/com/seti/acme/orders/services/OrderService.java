package com.seti.acme.orders.services;

import org.springframework.stereotype.Service;

import com.seti.acme.orders.DTO.order.Order;
import com.seti.acme.orders.DTO.order.OrderResponse;
import com.seti.acme.orders.DTO.order.xml.OrderXml;
import com.seti.acme.orders.DTO.order.xml.OrderXmlResponse;

@Service
public class OrderService {
  public OrderXml toXml(Order order) {
    return OrderXml
      .builder()
      .pedido(order.getNumPedido())
      .Cantidad(order.getCantidadPedido())
      .EAN(order.getCodigoEAN())
      .Producto(order.getNombreProducto())
      .Cedula(order.getNumDocumento())
      .Direccion(order.getDireccion())
      .build();
  }

  public OrderResponse toJson(OrderXmlResponse order) {
    return OrderResponse
      .builder()
      .codigoEnvio(order.getCodigo())
      .estado(order.getMensaje())
      .build();
  }
}
