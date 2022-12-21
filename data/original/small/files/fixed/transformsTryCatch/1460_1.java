@java.lang.Override
public void clear() {
    this.myIP = null;
    try {
        setMyPortIsSet(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.myPort = 0;
    this.entries = null;
}
