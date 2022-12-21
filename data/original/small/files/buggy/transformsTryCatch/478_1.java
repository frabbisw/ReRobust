public int findMedian2() {
    try {
        if ((maxheap.size()) == (minheap.size())) {
            return minheap.peek();
        } else {
            return maxheap.peek();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
