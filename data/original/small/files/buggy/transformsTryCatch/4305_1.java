@java.lang.Override
public void run(int frame) {
    try {
        processIdleMiningWorkers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
