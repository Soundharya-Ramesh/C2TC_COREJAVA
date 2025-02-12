package com.ShoppingMallManagementSystem.order.service;


import com.ShoppingMallManagementSystem.order.dto.OrderDTO;
import java.util.List;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(Long id);
    String deleteOrder(Long id);
}
