@java.lang.Override
public void onClick(android.view.View v) {
    float score = computeScore();
    saveDrawing(v);
    drawView.setEnabled(true);
    started = false;
    try {
        callback.onFinish(score, (10000 - (duration)));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
