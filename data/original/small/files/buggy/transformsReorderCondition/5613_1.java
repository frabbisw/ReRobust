@java.lang.Override
public int compareTo(pathfinder.Algorithms.AStarNode o) {
    return ((int) (((toGoal) + (toStart)) - ((o.toStart) - (o.toGoal))));
}
