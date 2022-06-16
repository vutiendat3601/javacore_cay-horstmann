package com.dv.chapter3_fundamental;

import java.util.ArrayList;
import java.util.List;

public class BitwiseOperator {

    public static List<List<Integer>> getSubArrs(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = 1 << nums.length;
        for (int i = 0; i < n; i++) {
            List<Integer> e = new ArrayList<>();
            String binNum = Integer.toBinaryString(i);
            int headZeroLen = nums.length - binNum.length();
            if (headZeroLen != 0) {
                System.out.format("%0" + (nums.length - binNum.length()) + "d%s\n", 0, binNum);
            } else {
                System.out.println(binNum);
            }

            for (int j = nums.length - 1; j >= 0; j--) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(nums[nums.length - 1 - j] + " ");
                    e.add(nums[nums.length - 1 - j]);
                }
            }
            System.out.println("\n");
            res.add(e);
        }
        return res;
    }

    // Main
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        List<List<Integer>> res = getSubArrs(nums);
        int k = 0;
    }

}