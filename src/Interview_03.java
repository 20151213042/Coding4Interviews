/*
面试题03. 数组中重复的数字
找出数组中重复的数字。

在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。
请找出数组中任意一个重复的数字。

Input:
{2, 3, 1, 0, 2, 5}

Output:
2

 */

import java.util.HashSet;
import java.util.Set;

public class Interview_03 {
    //使用set集合做判断，当set集合中存在已有元素时候，再次add会返回false
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int num : nums){
            if(!set.add(num)){
                ans = num;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        int[] nums = {2, 3, 1, 0, 2, 5};
    }
}
