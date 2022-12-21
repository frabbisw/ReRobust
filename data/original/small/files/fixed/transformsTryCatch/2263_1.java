@java.lang.Override
public void onClick(android.view.View v) {
    doodleView.setPenColor(tempColor);
    try {
        doodleView.setPenWidth(tempProgress);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    selectDialog.dismiss();
}
