package com.ShoppingMallManagementSystem.order.repository;


	import com.ShoppingMallManagementSystem.order.Order;
	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

	@Repository
	public interface OrderRepository extends JpaRepository<Order, Long> {
	}



