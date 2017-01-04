package com.bulingbuling.entity;

/**
 * Created by bonismo@hotmail.com
 * 上午12:33 on 17/1/5.
 * <p>
 * 商品
 */
public class Goods {

    // 商品 ID
    private String goodsId;

    // 商品名字
    private String goodsName;

    // 商品价格
    private String goodsPrice;

    // 商品图片地址
    private String goodsImg;

    // 商品库存
    private String goodsStock;

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(String goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public String getGoodsImg() {
        return goodsImg;
    }

    public void setGoodsImg(String goodsImg) {
        this.goodsImg = goodsImg;
    }

    public String getGoodsStock() {
        return goodsStock;
    }

    public void setGoodsStock(String goodsStock) {
        this.goodsStock = goodsStock;
    }
}
