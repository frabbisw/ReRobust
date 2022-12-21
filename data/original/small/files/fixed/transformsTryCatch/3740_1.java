@java.lang.Override
public void onClick(android.view.View view) {
    lineNum = 0;
    currentText = "";
    try {
        log.setText(currentText);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    shapeLayout.removeAllViews();
}
