public org.eclipse.swt.graphics.Color calculateBackColor() {
    System.out.println("log");
    return calculateAlarmColor(isBackColorAlarmSensitive, saveBackColor, isBeastAndActiveAlarm());
}
