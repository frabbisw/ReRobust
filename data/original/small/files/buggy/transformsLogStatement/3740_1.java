@java.lang.Override
public void onClick(android.view.View view) {
    lineNum = 0;
    currentText = "";
    log.setText(currentText);
    System.out.println("log");
    shapeLayout.removeAllViews();
    interpreter.clear();
}
