@java.lang.Override
public void onClick(android.view.View v) {
    float score = computeScore();
    try {
        saveDrawing();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    drawView.setEnabled(true);
    started = false;
    callback.onFinish(score, (10000 - (duration)));
}
