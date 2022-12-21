@java.lang.Override
public void clear() {
    System.out.println("log");
    this.myIP = null;
    setMyPortIsSet(false);
    this.myPort = 0;
    setMyClusterIDIsSet(false);
    this.myClusterID = 0;
    this.entries = null;
}
