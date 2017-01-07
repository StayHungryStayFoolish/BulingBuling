package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 下午2:18 on 17/1/7.
 * <p>
 * 订单
 */
public class Order {

    // 订单
    private String orderId;

    // 订单人名字
    private String orderUserName;

    // 订单商品名字
    private String orderGoodsName;

    // 订单商品图片
    private String orderGoodsImg;

    // 订单价格
    private String orderPrice;

    // 订单状态
    private String orderStatus;

    // 订单时间
    private String orderTime;

    // 订单收货地址
    private String orderAddress;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderUserName() {
        return orderUserName;
    }

    public void setOrderUserName(String orderUserName) {
        this.orderUserName = orderUserName;
    }

    public String getOrderGoodsName() {
        return orderGoodsName;
    }

    public void setOrderGoodsName(String orderGoodsName) {
        this.orderGoodsName = orderGoodsName;
    }

    public String getOrderGoodsImg() {
        return orderGoodsImg;
    }

    public void setOrderGoodsImg(String orderGoodsImg) {
        this.orderGoodsImg = orderGoodsImg;
    }

    public String getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(String orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }

    public String getOrderAddress() {
        return orderAddress;
    }

    public void setOrderAddress(String orderAddress) {
        this.orderAddress = orderAddress;
    }
}
