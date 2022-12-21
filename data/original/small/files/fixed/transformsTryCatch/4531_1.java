@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (!(isMeasurementStarted)) {
            onStartClicked();
        } else {
            onStopClicked(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
