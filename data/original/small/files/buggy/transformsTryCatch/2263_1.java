@java.lang.Override
public void onClick(android.view.View v) {
    try {
        doodleView.setPenColor(tempColor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    doodleView.setPenWidth(tempProgress);
    com.smartdraw.dijay.Activity.SketchpadActivity.currentPenColor = tempColor;
    com.smartdraw.dijay.Activity.SketchpadActivity.currentPenWidth = tempProgress;
    selectDialog.dismiss();
}
