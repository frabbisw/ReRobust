public int compareTo(edu.ucla.sspace.clustering.AverageLinkAgglomerativeClustering.Link o) {
    double diff = (this.sim) - (o.sim);
    if (0 > diff)
        return -1;
    return diff == 0.0 ? 0 : 1;
}
