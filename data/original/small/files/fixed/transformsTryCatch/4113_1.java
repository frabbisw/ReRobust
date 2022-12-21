public void attendiEndAll() throws java.lang.InterruptedException {
    concurrent.LockManager.lockEndAll.lock();
    try {
        while (concurrent.LockManager.inAttesaEndAll) {
            concurrent.LockManager.conditionEndAll.await();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    concurrent.LockManager.lockEndAll.unlock();
}
