package com.atguigu;

import java.util.HashSet;

public class demo {
    public static void main(String[] args) {
//        FastFood food = new rice();
//        System.out.println(food.getPrice());
//        FastFood fastFood = new Egg(food);
//       fastFood.cost();
//       fastFood.getPrice();
        int[]nums = {1,2,3,1};
        demo demo = new demo();
        boolean b = demo.containsDuplicate(nums);
        int i = demo.containsDuplicate1(nums);
        System.out.println(i);
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet hashSet = new HashSet();
        for (int num : nums) {
            hashSet.add(num);
        }
        if (hashSet.size() != nums.length){
            return  true;
        }
        return  false;
    }

    public int containsDuplicate1(int[] nums) {
        int dp[] = new int[nums.length];
        dp[0]=nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (dp[i-1]>0){
                dp[i] = dp[i-1]+nums[i];
            }else {

                dp[i]= nums[i];
            }
        }
        int res = dp[0];
        for (int i : dp) {
            res = Math.max(res, i);
        }
        return res;
    }
}
