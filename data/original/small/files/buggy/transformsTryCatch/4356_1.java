@java.lang.Override
public void onSubmit(org.reactome.web.pwp.client.tools.analysis.submitters.FormPanel.SubmitEvent event) {
    try {
        setStatusIcon(CommonImages.INSTANCE.loader(), true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    errorPanel.makeVisible(false);
}
