@java.lang.Override
public boolean shouldExecute() {
    try {
        if ((runDelay) > 0) {
            --(runDelay);
            return false;
        } else {
            runDelay = 200 + (theEntity.getRNG().nextInt(200));
            return searchForDestination();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
