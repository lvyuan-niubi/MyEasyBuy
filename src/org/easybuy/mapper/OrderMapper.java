package org.easybuy.mapper;

import org.easybuy.entity.Order;
import org.easybuy.entity.Product;

import java.util.List;

public interface OrderMapper {//mybatis接口 dao
  /*  <!-- 根据用户id 查询订单-->*/
    public Order queryOrderByUserId(int userId);

  /*  根据订单id 查询该订单 所有商品*/
    public List<Product> queryProductListByOrderId(int userId);
}
