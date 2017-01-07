package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 下午2:26 on 17/1/7.
 * <p>
 * 购物车
 */
public class ShoppingCart {

    // 购物车 ID
    private String cartId;

    // 购买用户名字
    private String userName;

    // 购买商品 ID
    private String shoppingId;

    // 商品图片地址
    private String shoppingImg;

    // 商品价格
    private String shoppingPrice;

    public String getCartId() {
        return cartId;
    }

    public void setCartId(String cartId) {
        this.cartId = cartId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getShoppingId() {
        return shoppingId;
    }

    public void setShoppingId(String shoppingId) {
        this.shoppingId = shoppingId;
    }

    public String getShoppingImg() {
        return shoppingImg;
    }

    public void setShoppingImg(String shoppingImg) {
        this.shoppingImg = shoppingImg;
    }

    public String getShoppingPrice() {
        return shoppingPrice;
    }

    public void setShoppingPrice(String shoppingPrice) {
        this.shoppingPrice = shoppingPrice;
    }
}
