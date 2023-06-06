package com.dmclabs;

import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Arrays;
import java.util.List;

/**
 * Hello world!
 *
 */
public class Unit1Session1 
{

    public static void main( String[] args )
    {

        //SECTION - Contains Duplicates
        System.out.println("Problem 1: Contains Duplicates");
        int[][] problemOneTests = {
            {1,2,3,1},
            {1,2,3,4},
            {1,1,1,3,3,4,3,2,4,2}
        };

        int i = 1;
        for (int[] arr : problemOneTests) {
            boolean result = Unit1Session1.containsDuplicates(arr);
            System.out.println("Test " + i++ + ":" + " " + result);
        }
        System.out.println();

        //SECTION - Two Sum Execute
        System.out.println("Problem 2: Two Sum");
        int[] targets = {9,6,6};
        int[][] problemTwoTests = {
            {2,7,11,15},
            {2,3,4},
            {3,3}
        };
        
        for (int j = 0; j < targets.length; j++) {
            int[] result = Unit1Session1.twoSum(targets[j], problemTwoTests[j]);
            System.out.println("Test " + (j + 1) + ": " + "[" + result[0] + "," + result[1] + "]");
        }
        System.out.println();

    }
//NOTE - Session 1 Function Definitions

    //SECTION - Problem 1 Contains Duplicates
    /**
     * Given an integer array check for duplicates.
     * @param nums An array of itegers.
     * @return True if there is at least one duplicate, otherwise false.
     */
    public static boolean containsDuplicates(List<Integer> nums) {
        Set<Integer> detect = new HashSet<>();
        for (int num : nums) {
            if (!detect.add(num)) {
                return true;
            }
        }
        return false;
    }

    //SECTION - Problem 2 Two Sum
    /**
     * Given an integer array and a target integer, return the
     * indices of the two numbers which are the sum of the target.
     * @param target The target sum value.
     * @param nums An array of integers.
     * @return Sum of the indices
     */
    public static int[] twoSum(int target, List<Integer> nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.size(); i++) {
            int complement = target - nums.get(i);
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement),i};
            } else {
                map.put(nums.get(i),i);
            }
        }
        return new int[0];
    }



    //SECTION - Problem 3 Longest Consecutive Sequence

    public static int longestConsecutiveSequence(List<Integer> nums) {
        
    }

    //SECTION - (BONUS) Problem 4 Roman to Integer

    //SECTION - (BONUS) Problem 5 Destination City


}
