@java.lang.Override
public void onClick(android.view.View v) {
    checkIfClueFound();
    try {
        showCompletedQuestMessage();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
