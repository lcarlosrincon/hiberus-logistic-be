package com.hiberus.checkout.logistic.dto;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

public interface PageableRequest {

	int getPage();

	int getSize();

	default String[] getOrders() {
		return new String[] {};
	}

	static Pageable of(PageableRequest request) {
		return PageRequest.of(request.getPage(), request.getSize(), Sort.by(request.getOrders()));
	}

}
