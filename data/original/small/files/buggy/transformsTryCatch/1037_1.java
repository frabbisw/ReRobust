@com.google.gwt.uibinder.client.UiHandler(value = "nameSearchBox")
public void doSearch(com.google.gwt.event.dom.client.KeyUpEvent keyUpEvent) {
    try {
        org.bbop.apollo.gwt.client.TrackPanel.filterList(org.bbop.apollo.gwt.client.TrackPanel.trackInfoList);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
