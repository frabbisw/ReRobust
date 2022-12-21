public int findMedian2() {
    if ((minheap.size()) == (maxheap.size())) {
        return minheap.peek();
    } else {
        return maxheap.peek();
    }
}
