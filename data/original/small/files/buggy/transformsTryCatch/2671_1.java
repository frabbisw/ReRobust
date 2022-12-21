@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent arg0) {
    try {
        if (chbDiaSilence.getSelection()) {
            diaAlarmCount = (config.alarm.diaAlarmSilenceSeconds) * (usbEventHz);
        } else {
            chbDiaSilence.setText("Silence");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
