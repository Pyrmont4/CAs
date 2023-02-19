package com.atguigu;

/**
 * 抽象构建
 */
public abstract class FastFood {
     Integer price;
     String desc;

    public FastFood(Integer price, String desc) {
        this.price = price;
       this.desc = desc;
    }

    public Integer getPrice() {
        return price;
    }

    public FastFood() {
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    abstract void cost();
}
