public synchronized void onEachIteration(org.group17.Map.GameMap gmMap, double dTimePerFrame) {
    jump(gmMap);
    accelerateHorizontal(gmMap, dTimePerFrame);
    try {
        bubble(gmMap, dTimePerFrame);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
