@java.lang.Override
public void visitWater(com.wecanteven.Visitors.Water water) {
    System.out.println("log");
    this.setCanMove(true);
    visitedCurrent = false;
}
