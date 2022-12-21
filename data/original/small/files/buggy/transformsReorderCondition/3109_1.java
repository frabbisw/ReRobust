private boolean hasRight(int childIndex) {
    T rightChild = this.sequence.get((2 + (2 * childIndex)));
    return (this.sequence.get(childIndex).compareTo(rightChild)) < 0;
}
