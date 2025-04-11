package com.seti.acme.orders.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seti.acme.orders.DTO.order.Order;
import com.seti.acme.orders.DTO.order.OrderResponse;
import com.seti.acme.orders.DTO.order.xml.OrderXml;
import com.seti.acme.orders.DTO.order.xml.OrderXmlResponse;
import com.seti.acme.orders.services.OrderService;

@RestController
@RequestMapping("/api")
public class OrderController {
  @Autowired
  private OrderService orderService;

  @PostMapping(value = "/enviarPedido", produces = MediaType.APPLICATION_XML_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
  public OrderXml send(@RequestBody Order order) {
    return orderService.toXml(order);
  }

  @PostMapping(value = "/pedido", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_XML_VALUE)
  public OrderResponse getOrder(@RequestBody OrderXmlResponse order) {
    return orderService.toJson(order);
  }
}
