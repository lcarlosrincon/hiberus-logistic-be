package com.hiberus.checkout.logistic.dto;

public class OrderResponse extends ObjectResponseSuccess<Order> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2748275402687043818L;

	public OrderResponse(Order data) {
		super(data);
	}

	public OrderResponse() {
		super(null);
	}

}
