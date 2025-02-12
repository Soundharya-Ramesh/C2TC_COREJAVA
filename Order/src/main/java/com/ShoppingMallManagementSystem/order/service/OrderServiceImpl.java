package com.ShoppingMallManagementSystem.order.service;


import com.ShoppingMallManagementSystem.order.dto.OrderDTO;
import com.ShoppingMallManagementSystem.order.mapper.OrderMapper;
import com.ShoppingMallManagementSystem.order.Order;
import com.ShoppingMallManagementSystem.order.repository.OrderRepository;
import com.ShoppingMallManagementSystem.order.exception.OrderNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        Order order = OrderMapper.toEntity(orderDTO);
        order = orderRepository.save(order);
        return OrderMapper.toDTO(order);
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return orderRepository.findAll().stream()
                .map(OrderMapper::toDTO)
                .collect(Collectors.toList());
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return orderRepository.findById(id)
                .map(OrderMapper::toDTO)
                .orElseThrow(() -> new OrderNotFoundException("Order not found"));
    }

    @Override
    public String deleteOrder(Long id) {
        if (orderRepository.existsById(id)) {
            orderRepository.deleteById(id);
            return "Order deleted successfully";
        }
        throw new OrderNotFoundException("Order not found");
    }
}
