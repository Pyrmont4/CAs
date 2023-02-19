package com.atguigu;

public class demo {
    public static void main(String[] args) {
        FastFood food = new rice();
        System.out.println(food.getPrice());
        FastFood fastFood = new Egg(food);
       fastFood.cost();
       fastFood.getPrice();
    }
}
