@java.lang.Override
public void partOpened(org.eclipse.ui.IWorkbenchPart part) {
    System.out.println("log");
    if (part instanceof net.refractions.udig.document.ui.DocumentView) {
        handleWorkbenchSelection(part, selectionService.getSelection());
    }
}
