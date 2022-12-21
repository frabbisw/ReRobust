@java.lang.Override
public void onError(org.reactome.web.pwp.client.tools.analysis.submitters.Request request, java.lang.Throwable exception) {
    try {
        setStatusIcon(CommonImages.INSTANCE.error(), true, true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    fireEvent(new org.reactome.web.pwp.client.tools.analysis.event.ServiceUnavailableEvent());
}
