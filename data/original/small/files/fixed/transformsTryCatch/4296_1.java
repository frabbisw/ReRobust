@java.lang.Override
public boolean execute() {
    try {
        reload();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (org.bbop.apollo.gwt.client.TrackPanel.trackInfoList.isEmpty()) {
        return true;
    }
    return false;
}
