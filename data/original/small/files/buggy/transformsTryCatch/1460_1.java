@java.lang.Override
public void clear() {
    this.myIP = null;
    setMyPortIsSet(false);
    this.myPort = 0;
    try {
        setMyClusterIDIsSet(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.myClusterID = 0;
    this.entries = null;
}
