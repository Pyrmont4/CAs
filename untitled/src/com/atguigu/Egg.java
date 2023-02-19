package com.atguigu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Egg extends Gander{
    public Egg(Integer price, String desc, FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    public Egg() {
    }

    public Egg(FastFood fastFood) {
        super(1, "鸡蛋", fastFood);
    }

    @Override
    void cost() {
        this.setDesc(this.getDesc()+this.getFastFood().getDesc());
        this.setPrice(this.getPrice()+this.getFastFood().getPrice());
    }
}
