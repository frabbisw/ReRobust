@java.lang.Override
public void run() {
    Log.Aircraft.info(mName, "Piste d�gag�e");
    try {
        if (!(runway.release(this)))
            Log.Aircraft.error(mName, "Piste utilis�e avant qu'elle ait �t� d�gag�e");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    crossHoldingCircuitAndExit();
}
