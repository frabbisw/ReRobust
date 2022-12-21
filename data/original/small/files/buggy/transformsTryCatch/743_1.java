double kNearestNeighbours(double[] pos, int k, dist.IMetric metric) {
    giant_galaxy.IFixedPriorityQueue queue = new giant_galaxy.LinearFixedPriorityQueue(k);
    try {
        kNearestNeighbours(pos, k, root, queue, metric);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return queue.max();
}
