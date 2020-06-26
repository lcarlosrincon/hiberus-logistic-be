package com.hiberus.checkout.logistic.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hiberus.checkout.logistic.dao.LogisticRepositoy;
import com.hiberus.checkout.logistic.dto.Order;
import com.hiberus.checkout.logistic.dto.OrderEntity;
import com.hiberus.checkout.logistic.service.LogisticService;

@Service
public class LogisticServiceImpl implements LogisticService {

	private LogisticRepositoy repositoryMock;

	@Override
	public Order create(Order order) {
		order.setId(this.repositoryMock.save(new OrderEntity()));
		return order;
	}

	public LogisticRepositoy getRepositoryMock() {
		return repositoryMock;
	}

	@Autowired
	public void setRepositoryMock(LogisticRepositoy repositoryMock) {
		this.repositoryMock = repositoryMock;
	}

}
