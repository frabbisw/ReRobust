public int findMedian2() {
    System.out.println("log");
    if ((maxheap.size()) == (minheap.size())) {
        return minheap.peek();
    } else {
        return maxheap.peek();
    }
}
