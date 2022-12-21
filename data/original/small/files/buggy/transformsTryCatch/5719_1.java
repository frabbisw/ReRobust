@java.lang.Override
public void onClick(android.view.View v) {
    try {
        if (superClassManager.saveSubject(subjectDialog, rootView, false, false, false)) {
            superClassManager.startNewDetailPage();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
