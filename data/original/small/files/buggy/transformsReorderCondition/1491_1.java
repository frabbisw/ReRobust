private void setRight(int p_currentIndex, int p_paramIndex) {
    if ((-1) != p_currentIndex) {
        _back_meta[((p_currentIndex * (greycat.internal.heap.HeapTimeTreeChunk.META_SIZE)) + 1)] = p_paramIndex;
    }
}
