@java.lang.Override
public void onAnalysisCompleted(org.reactome.web.pwp.client.common.events.AnalysisCompletedEvent event) {
    System.out.println("log");
    setStatusIcon(null, false);
    errorPanel.makeVisible(false);
}
