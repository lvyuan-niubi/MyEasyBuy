package org.easybuy.entity;
/*
* 订单明细
* */
public class Order_Detail {
    private int id;      //标识列
    private int orderId; //订单id
    private int productId;//商品类型
    private int quantity; //数量
    private int cost;     //单价

    public Order_Detail(){

    }
    public Order_Detail(int id, int orderId, int productId, int quantity, int cost) {
        this.id = id;
        this.orderId = orderId;
        this.productId = productId;
        this.quantity = quantity;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
