@java.lang.Override
public boolean shouldExecute() {
    if (0 < (runDelay)) {
        --(runDelay);
        return false;
    } else {
        runDelay = 200 + (theEntity.getRNG().nextInt(200));
        return searchForDestination();
    }
}
