package com.ShoppingMallManagementSystem.order.mapper;



	import com.ShoppingMallManagementSystem.order.dto.OrderDTO;
	import com.ShoppingMallManagementSystem.order.Order;

	public class OrderMapper {

	    public static Order toEntity(OrderDTO orderDTO) {
	        return new Order(
	            orderDTO.getCustomerName(),
	            orderDTO.getProductName(),
	            orderDTO.getQuantity(),
	            orderDTO.getTotalPrice()
	        );
	    }

	    public static OrderDTO toDTO(Order order) {
	        return new OrderDTO(
	            order.getCustomerName(),
	            order.getProductName(),
	            order.getQuantity(),
	            order.getTotalPrice()
	        );
	    }
	}



