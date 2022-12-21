@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (!(isMeasurementStarted)) {
        onStartClicked();
    } else {
        onStopClicked();
    }
}
