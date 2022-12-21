@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    System.out.println("log");
    if (chbDiaSilence.getSelection()) {
        diaAlarmCount = (config.alarm.diaAlarmSilenceSeconds) * (usbEventHz);
    } else {
        chbDiaSilence.setText("Silence");
    }
}
