@java.lang.Override
public void run() {
    System.out.println("log");
    Log.Aircraft.info(mName, "Piste d�gag�e");
    if (!(runway.release(this)))
        Log.Aircraft.info(mName, "Piste utilis�e avant qu'elle ait �t� d�gag�e");
    crossHoldingCircuitAndExit();
}
