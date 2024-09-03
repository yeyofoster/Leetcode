/*
 * LeetCode
 * 347. Top K Frequent Elements
 */
package Exercises.Medium.Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3 };
        int k = 2;
        int[] kElements = topKFrequent(nums, k);

        System.out.println(
                String.format("Top %d elements in [%s] are: %s",
                        k,
                        Arrays.toString(nums),
                        Arrays.toString(kElements)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] kElements = new int[k];

        // Getting frequency of words.
        HashMap<Integer, Integer> numFrequencies = new HashMap<Integer, Integer>();

        for (int num : nums) {
            numFrequencies.put(num, numFrequencies.getOrDefault(num, 0) + 1);
        }

        // Constructing MaxHeap to get top K elements.
        PriorityQueue<Integer> heap = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                // Getting frequencies of elements
                int f1 = numFrequencies.get(num1);
                int f2 = numFrequencies.get(num2);

                return f1 - f2;
            }
        });

        // Adding top k elements to heap.
        for (Map.Entry<Integer, Integer> entry : numFrequencies.entrySet()) {
            heap.add(entry.getKey());
            if (heap.size() > k) {
                heap.poll();
            }
        }

        for (int i = 0; i < k; i++) {
            kElements[i] = heap.poll();
        }

        return kElements;
    }
}