private boolean hasRight(int childIndex) {
    System.out.println("log");
    T rightChild = this.sequence.get(((2 * childIndex) + 2));
    return (this.sequence.get(childIndex).compareTo(rightChild)) < 0;
}
