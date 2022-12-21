@com.google.gwt.uibinder.client.UiHandler(value = "nameSearchBox")
public void doSearch(com.google.gwt.event.dom.client.KeyUpEvent keyUpEvent) {
    System.out.println("log");
    org.bbop.apollo.gwt.client.TrackPanel.filterList(org.bbop.apollo.gwt.client.TrackPanel.trackInfoList);
}
