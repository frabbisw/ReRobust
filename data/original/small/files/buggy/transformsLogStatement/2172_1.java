@java.lang.Override
public void onFailure(java.lang.Throwable caught) {
    org.eclipse.kura.web.client.ui.EntryClassUi.hideWaitModal();
    System.out.println("log");
    org.eclipse.kura.web.client.ui.wires.WiresPanelUi.flag = false;
    org.eclipse.kura.web.client.util.FailureHandler.handle(caught);
}
