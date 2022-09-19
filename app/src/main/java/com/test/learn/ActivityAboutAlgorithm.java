package com.test.learn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.test.mylibrary.ListNode;

import java.util.HashSet;
import java.util.Set;

public class ActivityAboutAlgorithm extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_algorithm);
    }

    //给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
    //
    //你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
    //
    //你可以按任意顺序返回答案。
    //输入：nums = [2,7,11,15], target = 9
    //输出：[0,1]
    //解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
    //
    //来源：力扣（LeetCode）
    //链接：https://leetcode.cn/problems/two-sum
    //著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j< nums.length;j++){
                if(nums[i]+nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
    //给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
    //
    //请你将两个数相加，并以相同形式返回一个表示和的链表。
    //
    //你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
    //
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null;
        ListNode tail = null;
        int carry = 0;
        while(l1 != null || l2 != null){
            int value1 = l1 == null? 0:l1.value;
            int value2 = l2 == null? 0:l2.value;
            if(head == null){
                tail = new ListNode((value1+value2+carry)%10);
                head = tail;
            }else{
                tail.next = new ListNode((value1+value2+carry)%10);
                tail = tail.next;
            }
            carry = (value1+value2+carry)/10;
            if(l1 != null && l1.next != null){
                l1 = l1.next;
            }else{
                l1 = null;
            }
            if(l2 != null && l2.next != null){
                l2 = l2.next;
            }else{
                l2 = null;
            }
        }
        if(carry != 0){
            tail.next = new ListNode(carry);
        }
        return head;
    }

    //给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。(abcdefgad)
    public int lengthOfLongestSubstring(String s) {
        // 哈希集合，记录每个字符是否出现过
        Set<Character> occ = new HashSet<Character>();
        int n = s.length();
        // 右指针，初始值为 -1，相当于我们在字符串的左边界的左侧，还没有开始移动
        int rk = -1, ans = 0;
        for (int i = 0; i < n; ++i) {
            if (i != 0) {
                // 左指针向右移动一格，移除一个字符
                occ.remove(s.charAt(i - 1));
            }
            while (rk + 1 < n && !occ.contains(s.charAt(rk + 1))) {
                // 不断地移动右指针
                occ.add(s.charAt(rk + 1));
                ++rk;
            }
            // 第 i 到 rk 个字符是一个极长的无重复字符子串
            ans = Math.max(ans, rk - i + 1);
        }
        return ans;
    }
    //寻找两个正序数组的中位数
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int[] help = new int[n1 + n2];
        int l1 = 0;
        int l2 = 0;
        int index = 0;
        while (l1 < n1 && l2 < n2) {
            if (nums1[l1] <= nums2[l2]) {
                help[index++] = nums1[l1];
                l1++;
            } else {
                help[index++] = nums2[l2];
                l2++;
            }
        }
        while (l1 < n1) {
            help[index++] = nums1[l1++];
        }
        while (l2 < n2) {
            help[index++] = nums2[l2++];
        }
        int n = help.length;
        if (n % 2 != 0) {
            return help[n / 2];
        }else {
            return (help[(n / 2) - 1] + help[n / 2]) / 2.0;
        }
    }

}