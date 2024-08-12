package com.LeanDSA.Models;

import com.LeanDSA.Arrays.DuplicateInteger;

public class Data {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        DuplicateInteger solution = new DuplicateInteger();

        // Define an array to test
        int[] nums = {1, 2, 3, 4, 5, 6, 3}; // This array contains a duplicate

        // Call the hasDuplicate method
        boolean result = solution.hasDuplicate(nums);

        // Print the result
        if (result) {
            System.out.println("Array contains duplicates.");
        } else {
            System.out.println("Array does not contain duplicates.");
        }
    }
}
