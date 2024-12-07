package com.klef.jfsd.exam.OrdersPlatform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.exam.OrdersPlatform.model.Order;
import com.klef.jfsd.exam.OrdersPlatform.repository.OrderRepository;
@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	public OrderRepository orderRepository;
	
	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

}
