package com.siddhu.dreamshops.service.order;

import com.siddhu.dreamshops.dto.OrderDto;
import com.siddhu.dreamshops.model.Order;

import java.util.List;

public interface IOrderService {
    Order placeOrder(Long userId);
    OrderDto getOrder(Long orderId);
    List<OrderDto> getUserOrders(Long userId);
}
