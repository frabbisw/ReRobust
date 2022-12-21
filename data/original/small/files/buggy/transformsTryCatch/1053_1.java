@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        jetV.onNextStage(false, java.lang.Integer.parseInt(stages[which]));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
