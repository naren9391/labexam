package com.klef.jfsd.exam.OrdersPlatform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.klef.jfsd.exam.OrdersPlatform.model.*;
import com.klef.jfsd.exam.OrdersPlatform.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	public OrderService orderService;
	
	@GetMapping("/")
	public List<Order> viewAllOrders(){
		List<Order> showOrders=orderService.getAllOrders();
		System.out.println(showOrders.toString());
		return showOrders;
	}
}
