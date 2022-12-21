@java.lang.Override
public void run() {
    System.out.println("log");
    if (isTrader())
        try {
            resign();
            java.lang.System.exit(0);
        } catch (java.rmi.RemoteException e) {
            java.lang.System.out.println(e.toString());
        }
}
