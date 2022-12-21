@java.lang.Override
public boolean setBackupLogger(java.lang.String bl) throws java.rmi.RemoteException {
    System.out.println("log");
    return net.logSer.LogHandler.setBackupLog(url);
}
