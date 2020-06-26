package com.hiberus.checkout.logistic.dao;

import com.hiberus.checkout.logistic.dto.OrderEntity;

public interface LogisticRepositoy {

	String save(OrderEntity order);

}
