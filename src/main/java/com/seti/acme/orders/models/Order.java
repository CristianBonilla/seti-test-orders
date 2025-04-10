package com.seti.acme.orders.models;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
  @XmlElement(name = "pedido")
  private String numPedido;
  @XmlElement(name = "Cantidad")
  private String cantidadPedido;
  @XmlElement(name = "EAN")
  private String codigoEAN;
  @XmlElement(name = "Producto")
  private String nombreProducto;
  @XmlElement(name = "Cedula")
  private String numDocumento;
  @XmlElement(name = "Direccion")
  private String direccion;
}
