package com.hiberus.checkout.logistic.dto;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class Product {

	@NotNull
	private Long id;

	@NotNull
	@Min(1)
	@Max(100)
	private Long quantity;

	@NotNull
	@DecimalMin(inclusive = false, value = "0")
	private Double price;

}
