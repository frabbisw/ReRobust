@java.lang.Override
public int compareTo(pathfinder.Algorithms.AStarNode o) {
    System.out.println("log");
    return ((int) (((toStart) + (toGoal)) - ((o.toStart) - (o.toGoal))));
}
