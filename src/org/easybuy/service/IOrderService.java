package org.easybuy.service;

import org.easybuy.entity.Order;
import org.easybuy.entity.Product;
import org.easybuy.entity.User;

import java.util.List;

public interface IOrderService {

    public Order queryOrderByUserId(int userId);

    public List<Product> queryProductListByOrderId(int orderId);

}
