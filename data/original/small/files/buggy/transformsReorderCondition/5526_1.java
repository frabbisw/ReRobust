public boolean hasNext() {
    return ((in.valueCount()) < (blocks[block].valueCount)) || ((block) < ((blocks.length) - 1));
}
