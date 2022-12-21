@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    try {
        jetV.onNextStage(false, (which + 1));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
