package com.psp.ingenico.controllers;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psp.ingenico.dtos.PaymentResponseDTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class PaymentController {
	@GetMapping("/ingenico/payment")
	public ResponseEntity<PaymentResponseDTO> payment() {
		log.info("/ingenico/payment Entry time: {}",LocalDateTime.now());
	
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
	
			e.printStackTrace();
		}

		return ResponseEntity
				.ok(PaymentResponseDTO.builder().amount("100").status("SUCCESS").message("ingenico Payment").build());
	}
}
