public void attendiSette() throws java.lang.InterruptedException {
    concurrent.LockManager.lockSette.lock();
    while (concurrent.LockManager.inAttesaSette) {
        concurrent.LockManager.conditionSette.await();
    }
    concurrent.LockManager.inAttesaSette = true;
    try {
        concurrent.LockManager.lockSette.unlock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
