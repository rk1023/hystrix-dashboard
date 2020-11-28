package com.psp.ingenico.dtos;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PaymentResponseDTO {

	private String amount;
	private String status;
	private String message;
}
