package com.seti.acme.orders.DTO.order.xml;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@JacksonXmlRootElement(localName = "EnvioPedidoRequest")
@AllArgsConstructor
@Builder
@ToString
public class OrderXml {
  @JacksonXmlProperty(localName = "pedido")
  private String pedido;
  @JacksonXmlProperty(localName = "Cantidad")
  private String Cantidad;
  @JacksonXmlProperty(localName = "EAN")
  private String EAN;
  @JacksonXmlProperty(localName = "Producto")
  private String Producto;
  @JacksonXmlProperty(localName = "Cedula")
  private String Cedula;
  @JacksonXmlProperty(localName = "Direccion")
  private String Direccion;
}
