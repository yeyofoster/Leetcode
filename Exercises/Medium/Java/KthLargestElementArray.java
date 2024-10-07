/*
 * LeetCode
 * 215. Kth Largest Element in an Array
 */
package Exercises.Medium.Java;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

import Exercises.DataStructures.MaxHeap;

public class KthLargestElementArray {
    public static void main(String[] args) {
        int[] nums = { 3, 2, 1, 5, 6, 4 };
        int k = 2;
        int result = findKthLargest(nums, k);
        System.out.println(String.format("The %dth element in %s is: %d", k, Arrays.toString(nums), result));
    }

    public static int findKthLargest(int[] nums, int k) {
        int largest = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        MaxHeap visualHeap = new MaxHeap(maxHeap);
        for (int i : nums) {
            maxHeap.add(i);
        }

        System.out.println(visualHeap.toString());
        for (int i = 0; i < k; i++) {
            largest = maxHeap.poll();
        }
        return largest;
    }
}