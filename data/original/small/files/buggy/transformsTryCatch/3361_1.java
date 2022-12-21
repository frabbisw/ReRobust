public void setMotorSpeeds(com.team3925.robot2016.util.DriveTrainSignal input) {
    try {
        sideLeft.setSpeed(com.team3925.robot2016.util.MiscUtil.limit(((input.left) * (com.team3925.robot2016.Constants.GLOBAL_MAX_DRIVE_TRAIN_PWR))));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    sideRight.setSpeed(com.team3925.robot2016.util.MiscUtil.limit(((input.right) * (com.team3925.robot2016.Constants.GLOBAL_MAX_DRIVE_TRAIN_PWR))));
}
