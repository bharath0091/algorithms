package com;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.stream.Collectors;

public class Main {

    private static class B {

    }
    public static void main(String[] args) {



//ArrayDeque
        List<String> list = new ArrayList<>();
        list.add("b");
        list.add("a");
//        list.stream().collect(Collectors.groupingBy())

//        Arrays.


//        2-3 nodes

        TreeMap<Integer, String> map =
                new TreeMap<>(Comparator.reverseOrder());

        Integer highestKey = map.lastKey();
        Integer lowestKey = map.firstKey();
        Set<Integer> keysLessThan3 = map.headMap(3).keySet();
        Set<Integer> keysGreaterThanEqTo3 = map.tailMap(3).keySet();

//        assertEquals(new Integer(5), highestKey);
//        assertEquals(new Integer(1), lowestKey);
//        assertEquals("[1, 2]", keysLessThan3.toString());
//        assertEquals("[3, 4, 5]", keysGreaterThanEqTo3.toString());


//        ArrayBlockingQueue

//        ArrayDeque

//        HashMap
        ArrayList al = new ArrayList<>();
        al.add(null);

        String[] arrau = new String[6];
//        LinkedList
        LinkedList<Character> a = new LinkedList<Character>();
        a.remove();
        a.push('h');
        System.out.println(a);
        String b ="";
//        StringBuilder sb = new StringBuilder(7)
//        StringBuilder c;
String[] c;
//        c = new String[];
        String text = "raceca 13123 r";

//        System.out.println(isPalindrome(text));
    }

    private static boolean isPalindrome(String text) {
        String cleanText = text.toLowerCase().replaceAll("[^a-z]", "").replaceAll("\\s", "");
        System.out.println(cleanText);
        int endIndex = cleanText.length() - 1;
        for (int startIndex = 0; startIndex < endIndex; startIndex++, endIndex--) {
            if (cleanText.charAt(startIndex) != cleanText.charAt(endIndex)) {
                return false;
            }
        }
        return true;
    }


    /** insertion sort
         public static void main(String []args){
         double a = 7.5;
        System.out.println(a);
        int[] data = {20, 15, 10, 90, 30, -10};
        for(int unsortedIndex = 0; unsortedIndex < data.length; unsortedIndex++) {
            int smallNumberIndex = unsortedIndex;
         for(int j = unsortedIndex + 1; j < data.length; j++) {
            if(data[j] < data[smallNumberIndex]) {
                smallNumberIndex = j;
            }
         }
         int temp = data[unsortedIndex];
         data[unsortedIndex] = data[smallNumberIndex];
         data[smallNumberIndex] = temp;
        }
        for(int i=0; i < data.length; i++){
                 System.out.println(data[i]);
        }
     }
     */
}