@java.lang.Override
public void visitWater(com.wecanteven.Visitors.Water water) {
    try {
        this.setCanMove(true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    visitedCurrent = false;
}
