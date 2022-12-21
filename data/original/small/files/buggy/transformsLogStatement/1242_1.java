@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    float score = computeScore();
    saveDrawing(v);
    drawView.setEnabled(true);
    started = false;
    callback.onFinish(score, (10000 - (duration)));
}
