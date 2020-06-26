package com.hiberus.checkout.logistic.dao.impl;

import java.util.Random;

import org.springframework.stereotype.Repository;

import com.hiberus.checkout.logistic.dao.LogisticRepositoy;
import com.hiberus.checkout.logistic.dto.OrderEntity;

@Repository
public class LogisticRepositoyImpl implements LogisticRepositoy {

	private static final int ORDER_ID_LENGTH = 5;

	public String save(OrderEntity order) {
		byte[] randoms = new byte[ORDER_ID_LENGTH];
		new Random().nextBytes(randoms);
		String id = new String(randoms);
		return id;
	}

}
