@java.lang.Override
public boolean execute() {
    reload();
    try {
        if ((org.bbop.apollo.gwt.client.TrackPanel.trackInfoList.size()) == 0) {
            return true;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return false;
}
