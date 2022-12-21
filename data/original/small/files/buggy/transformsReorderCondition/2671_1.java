@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    if (chbDiaSilence.getSelection()) {
        diaAlarmCount = (usbEventHz) * (config.alarm.diaAlarmSilenceSeconds);
    } else {
        chbDiaSilence.setText("Silence");
    }
}
