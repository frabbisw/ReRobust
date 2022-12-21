@java.lang.Override
public void partOpened(org.eclipse.ui.IWorkbenchPart part) {
    try {
        if (part instanceof net.refractions.udig.document.ui.DocumentView) {
            handleWorkbenchSelection(part, selectionService.getSelection());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
