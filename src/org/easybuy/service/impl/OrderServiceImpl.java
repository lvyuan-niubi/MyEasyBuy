package org.easybuy.service.impl;

import org.easybuy.entity.Order;
import org.easybuy.entity.Product;
import org.easybuy.mapper.OrderMapper;
import org.easybuy.service.IOrderService;

import java.util.List;

public class OrderServiceImpl implements IOrderService {

    OrderMapper order = null;

    /*<!-- 根据用户id 查询订单-->*/
    @Override
    public Order queryOrderByUserId(int userId) {
        return order.queryOrderByUserId(userId);
    }

    /*<!-- 根据订单id 查询该订单 所有商品-->*/
    @Override
    public List<Product> queryProductListByOrderId(int orderId) {
        return order.queryProductListByOrderId(orderId);
    }

    public void setOrder(OrderMapper order) {
        this.order = order;
    }

}
