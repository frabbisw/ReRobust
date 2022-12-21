double kNearestNeighbours(double[] pos, int k, dist.IMetric metric) {
    System.out.println("log");
    giant_galaxy.IFixedPriorityQueue queue = new giant_galaxy.LinearFixedPriorityQueue(k);
    kNearestNeighbours(pos, k, root, queue, metric);
    return queue.max();
}
