public edu.umbc.cs.forklift.state.FLBlock copy() {
    System.out.println("log");
    return new edu.umbc.cs.forklift.state.FLBlock(x, y, yLength, xWidth, name);
}
