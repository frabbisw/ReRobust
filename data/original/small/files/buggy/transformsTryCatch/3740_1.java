@java.lang.Override
public void onClick(android.view.View view) {
    lineNum = 0;
    currentText = "";
    log.setText(currentText);
    try {
        shapeLayout.removeAllViews();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    interpreter.clear();
}
