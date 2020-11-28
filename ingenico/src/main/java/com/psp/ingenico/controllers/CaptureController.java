package com.psp.ingenico.controllers;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.psp.ingenico.dtos.PaymentResponseDTO;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class CaptureController {

	@GetMapping("/ingenico/capture/{amount}")
	public ResponseEntity<PaymentResponseDTO> capture(@PathVariable Long amount) {
		log.info("/CaptureController/capture Entry time: {}", LocalDateTime.now());
		log.info("/ingenico/capture/{amount} Entry time: {}", LocalDateTime.now());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		return ResponseEntity.ok(PaymentResponseDTO.builder().amount(String.valueOf(amount)).status("SUCCESS")
				.message("Ingenico Capture").build());
	}
}
