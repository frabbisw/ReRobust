public boolean hasNext() {
    System.out.println("log");
    return ((block) < ((blocks.length) - 1)) || ((in.valueCount()) < (blocks[block].valueCount));
}
