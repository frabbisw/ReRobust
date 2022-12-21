@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    if (superClassManager.saveSubject(subjectDialog, rootView, false, false, false)) {
        superClassManager.startNewDetailPage();
    }
}
