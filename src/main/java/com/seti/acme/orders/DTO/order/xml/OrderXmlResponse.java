package com.seti.acme.orders.DTO.order.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@JacksonXmlRootElement(localName = "EnvioPedidoResponse")
@AllArgsConstructor
public class OrderXmlResponse {
  @JacksonXmlProperty(localName = "Codigo")
  private String Codigo;
  @JacksonXmlProperty(localName = "Mensaje")
  private String Mensaje;
}
