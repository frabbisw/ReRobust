public short getNodeInDegree(int nodeIndex) {
    short degree = nodeBuf.getShort(((nodeIndex * (uk.ac.kent.dover.fastGraph.FastGraph.NODE_BYTE_SIZE)) + (uk.ac.kent.dover.fastGraph.FastGraph.NODE_IN_DEGREE_OFFSET)));
    return degree;
}
