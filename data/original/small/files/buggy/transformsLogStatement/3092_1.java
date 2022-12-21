public void run() {
    System.out.println("log");
    if ((t.canceled) > 0) {
        scalingTimes.add(new ca.team2706.scouting.mcmergemanager.datamodels.ScalingTime(t.upTimer.currentTime(), t.canceled));
    }
}
