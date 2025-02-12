package com.ShoppingMallManagementSystem.order.controller;



	import com.ShoppingMallManagementSystem.order.dto.OrderDTO;
	import com.ShoppingMallManagementSystem.order.service.OrderService;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import java.util.List;

	@RestController
	@RequestMapping("/api/orders")
	public class OrderController {

	    private final OrderService orderService;

	    @Autowired
	    public OrderController(OrderService orderService) {
	        this.orderService = orderService;
	    }

	    @PostMapping
	    public OrderDTO createOrder(@RequestBody OrderDTO orderDTO) {
	        return orderService.createOrder(orderDTO);
	    }

	    @GetMapping
	    public List<OrderDTO> getAllOrders() {
	        return orderService.getAllOrders();
	    }

	    @GetMapping("/{id}")
	    public OrderDTO getOrderById(@PathVariable Long id) {
	        return orderService.getOrderById(id);
	    }

	    @DeleteMapping("/{id}")
	    public String deleteOrder(@PathVariable Long id) {
	        return orderService.deleteOrder(id);
	    }
	}



