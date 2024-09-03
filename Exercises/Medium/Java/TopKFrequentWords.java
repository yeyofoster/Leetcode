/*
 * LeetCode
 * 692. Top K Frequent Words
 */

package Exercises.Medium.Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {
    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        // String[] words = { "the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is" };
        int k = 2;
        List<String> topKWords = topKFrequent(words, k);
        System.out.println(String.format("Top %d words in [%s] are: %s", k, words.toString(), topKWords.toString()));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        // Getting frequency of words.
        HashMap<String, Integer> wordsFrequencies = new HashMap<String, Integer>();

        for (String word : words) {
            wordsFrequencies.put(word, wordsFrequencies.getOrDefault(word, 0) + 1);
        }

        // Constructing MaxHeap to get top K words.
        PriorityQueue<String> heap = new PriorityQueue<String>(new Comparator<String>() {
            @Override
            public int compare(String word1, String word2) {
                // Getting frequencies of words
                int f1 = wordsFrequencies.get(word1);
                int f2 = wordsFrequencies.get(word2);
                if (f1 == f2) {
                    return word2.compareTo(word1);
                }
                return f1 - f2;
            }
        });

        // Adding top k words to heap.
        for (Map.Entry<String, Integer> entry : wordsFrequencies.entrySet()) {
            heap.add(entry.getKey());
            if (heap.size() > k) {
                heap.poll();
            }
        }

        // Constructing list with top k words to return.
        List<String> topKWords = new ArrayList<>();
        while (!heap.isEmpty()) {
            topKWords.add(heap.poll());
        }

        // Reversing order of words.
        Collections.reverse(topKWords);

        return topKWords;
    }
}