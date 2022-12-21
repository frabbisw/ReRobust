public void attendiEndAll() throws java.lang.InterruptedException {
    System.out.println("log");
    concurrent.LockManager.lockEndAll.lock();
    while (concurrent.LockManager.inAttesaEndAll) {
        java.lang.System.out.println("AttendoEndAll");
        concurrent.LockManager.conditionEndAll.await();
    }
    java.lang.System.out.println("RiprendoEndAll");
    concurrent.LockManager.lockEndAll.unlock();
}
