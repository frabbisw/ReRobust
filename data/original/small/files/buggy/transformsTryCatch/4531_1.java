@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (!(isMeasurementStarted)) {
            onStartClicked();
        } else {
            onStopClicked();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
