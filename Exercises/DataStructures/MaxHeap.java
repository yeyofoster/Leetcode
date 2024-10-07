package Exercises.DataStructures;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    PriorityQueue<Integer> maxHeap;
    private int height;

    public MaxHeap() {
        maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
        height = 0;
    }

    public MaxHeap(PriorityQueue<Integer> maxHeap) {
        this.maxHeap = maxHeap;
    }

    public void fromArray(Integer[] array) {
        this.height = (int) (Math.log(array.length) / Math.log(2)) + 1;
        for (Integer integer : array) {
            this.maxHeap.add(integer);
        }
    }

    public void add(int num) {
        this.maxHeap.add(num);
        this.height = (int) (Math.log(this.maxHeap.size()) / Math.log(2)) + 1;
    }

    public int getHeight() {
        return height;
    }

    public String toString() {
        StringBuilder heapStringBuilder = new StringBuilder();
        PriorityQueue<Integer> copyHeap = new PriorityQueue<Integer>(this.maxHeap);
        int level = 1;
        int size = copyHeap.size();
        heapStringBuilder.append(String.format("Level %d:\t", level));
        for (int i = 0; i < size; i++) {
            int currentLevel = (int) (Math.log(i + 1) / Math.log(2)) + 1;
            if (level < currentLevel) {
                level = currentLevel;
                heapStringBuilder.append(String.format("\nLevel %d:\t", level));
            }
            heapStringBuilder.append(copyHeap.poll() + "\t");
        }
        return heapStringBuilder.toString();
    }
}