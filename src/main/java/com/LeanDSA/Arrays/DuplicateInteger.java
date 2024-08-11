package com.LeanDSA.Arrays;

public class DuplicateInteger {
        public boolean hasDuplicate(int[] nums) {
            // Variables i and j need to be declared and initialized
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        System.out.println("Contains Duplicate: " + nums[i]);
                        return true;  // Return true if a duplicate is found
                    }
                }
            }
            return false;
        }
    }

