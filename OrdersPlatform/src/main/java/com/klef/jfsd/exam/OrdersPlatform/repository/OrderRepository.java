package com.klef.jfsd.exam.OrdersPlatform.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.klef.jfsd.exam.OrdersPlatform.model.Order;
@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
