public void attendiSette() throws java.lang.InterruptedException {
    try {
        concurrent.LockManager.lockSette.lock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (concurrent.LockManager.inAttesaSette) {
        java.lang.System.out.println("AttendoSette");
        concurrent.LockManager.conditionSette.await();
    }
    java.lang.System.out.println("RiprendoSette");
    concurrent.LockManager.inAttesaSette = true;
    concurrent.LockManager.lockSette.unlock();
}
