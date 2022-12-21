@java.lang.Override
public void onFailure(final java.lang.Throwable caught) {
    try {
        org.eclipse.kura.web.client.ui.EntryClassUi.hideWaitModal();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.eclipse.kura.web.client.util.FailureHandler.handle(caught);
}
