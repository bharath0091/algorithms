package com;

import java.util.Arrays;

public class _Palindrome {

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
//        System.out.println(s.toLowerCase().replaceAll("[^a-z1-9]", ""));
        char[] chars = s.toLowerCase().replaceAll("[^a-z1-9]", "").toCharArray();
        for (int start =0, end=s.length() -1 ; start < end ; start++, end--) {
            if(chars[start] != chars[end]) {
                return ;
            }
        }
        return ;
    }

//    public boolean isPalindrome(String s) {
//        char[] chars = s.toLowerCase().replaceAll("[^a-z,1-9]", "").toCharArray();
//        for (int start =0, end=s.length() -1 ; start < end ;) {
//
//        }
//    }
}
