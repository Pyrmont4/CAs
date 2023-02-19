package com.atguigu;

/**
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 *
 *
 * 示例 1：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 8
 * 输出：[3,4]
 *
 * 示例 2：
 *
 * 输入：nums = [5,7,7,8,8,10], target = 6
 * 输出：[-1,-1]
 *
 * 示例 3：
 *
 * 输入：nums = [], target = 0
 * 输出：[-1,-1]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Arraylist {
    final static int FFF[] = {-1,-1};
    public static void main(String[] args) {
       int [] nums = {1,3};
       int  target = 1;
        int[] ints = searchRange(nums, target);
        for (int anInt : ints) {
            System.out.println(anInt);
        }
    }
    public static int[] searchRange(int[] nums, int target) {
        int [] res  = new int[2];
        if (nums.length<1){
            return FFF;
        }

        if (target<nums[0]||target>nums[nums.length-1]){
            return FFF;
        }

        if (nums.length==1){
            if (nums[0] == target){
                int resf [] = {0,0};
                return resf;
            }
        }
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target && flag ==true){
                res [0] = i;
                flag = false;
             }
            if (nums[i] == target && flag == false){
                res[1] = i;
            }
        }
        if (res[0]==0 &&res[1]==0){
            return FFF;
        }
        if (res[0]!=0&& res[1]==0){
            int resf1 [] = {res[0],res[0]};
            return resf1;
        }
       return  res;
    }
}
