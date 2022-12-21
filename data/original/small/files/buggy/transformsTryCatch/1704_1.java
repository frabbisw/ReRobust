@java.lang.Override
public void onAnalysisCompleted(org.reactome.web.pwp.client.common.events.AnalysisCompletedEvent event) {
    try {
        setStatusIcon(null, false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    errorPanel.makeVisible(false);
}
