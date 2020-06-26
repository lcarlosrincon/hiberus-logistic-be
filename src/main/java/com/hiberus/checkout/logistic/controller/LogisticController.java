package com.hiberus.checkout.logistic.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hiberus.checkout.logistic.dto.Order;
import com.hiberus.checkout.logistic.dto.OrderResponse;
import com.hiberus.checkout.logistic.service.LogisticService;

import io.swagger.v3.oas.annotations.Operation;
import lombok.extern.log4j.Log4j2;

@RequestMapping(path = "/logistic")
@RestController
@Log4j2
public class LogisticController {

	private LogisticService logisticService;

	@Operation(summary = "Store order in repository")
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderResponse> insert(@RequestBody @Valid Order request) {
		Order response = this.logisticService.create(request);
		log.debug("Order created:" + response);
		return ResponseEntity.status(HttpStatus.OK).body(new OrderResponse(response));
	}

	public LogisticService getLogisticService() {
		return logisticService;
	}

	@Autowired
	public void setLogisticService(LogisticService logisticService) {
		this.logisticService = logisticService;
	}
}
