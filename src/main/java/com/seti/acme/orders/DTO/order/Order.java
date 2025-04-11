package com.seti.acme.orders.DTO.order;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Order {
  private String numPedido;
  private String cantidadPedido;
  private String codigoEAN;
  private String nombreProducto;
  private String numDocumento;
  private String direccion;
}
