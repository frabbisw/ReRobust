private double normaliseTime(double time, ec.graph.GraphInitializer init) {
    if (0.0 == ((init.maxTime) - (init.minTime)))
        return 1.0;
    else
        return ((init.maxTime) - time) / ((init.maxTime) - (init.minTime));
}
