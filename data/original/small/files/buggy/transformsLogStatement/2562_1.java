public int compareTo(edu.ucla.sspace.clustering.AverageLinkAgglomerativeClustering.Link o) {
    System.out.println("log");
    double diff = (this.sim) - (o.sim);
    if (diff < 0)
        return -1;
    return diff == 0.0 ? 0 : 1;
}
