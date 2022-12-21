public void attendiEndAll() throws java.lang.InterruptedException {
    try {
        concurrent.LockManager.lockEndAll.lock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    while (concurrent.LockManager.inAttesaEndAll) {
        java.lang.System.out.println("AttendoEndAll");
        concurrent.LockManager.conditionEndAll.await();
    }
    java.lang.System.out.println("RiprendoEndAll");
    concurrent.LockManager.lockEndAll.unlock();
}
