package com.atguigu;

public abstract class Gander extends FastFood{
FastFood fastFood;

    public Gander() {
    }

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public Gander(Integer price, String desc, FastFood fastFood) {
        super(price, desc);
        this.fastFood = fastFood;
    }

    public Gander(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    @Override
    void cost() {

    }
}
