public void run() {
    try {
        if ((t.canceled) > 0) {
            scalingTimes.add(new ca.team2706.scouting.mcmergemanager.datamodels.ScalingTime(t.upTimer.currentTime(), t.canceled));
            t.canceled = 0;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
