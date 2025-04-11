package com.seti.acme.orders.DTO.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@Builder
@ToString
public class OrderResponse {
  private String codigoEnvio;
  private String estado;
}
