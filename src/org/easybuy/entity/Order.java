package org.easybuy.entity;

import java.util.Date;
/*
* 订单
* */
public class Order {

    private int id;             //标识列
    private int userId;         //用户ID
    private String loginName;   //用户名
    private String userAddress; //用户地址
    private Date createTime;    //下单时间
    private double cost;        //总价
    private String serialNumber;//序号 加密

    public Order(){

    }
    public Order(int id, int userId, String loginName, String userAddress, Date createTime, double cost, String serialNumber) {
        this.id = id;
        this.userId = userId;
        this.loginName = loginName;
        this.userAddress = userAddress;
        this.createTime = createTime;
        this.cost = cost;
        this.serialNumber = serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
