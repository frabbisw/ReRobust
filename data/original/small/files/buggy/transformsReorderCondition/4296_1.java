@java.lang.Override
public boolean execute() {
    reload();
    if (0 == (org.bbop.apollo.gwt.client.TrackPanel.trackInfoList.size())) {
        return true;
    }
    return false;
}
