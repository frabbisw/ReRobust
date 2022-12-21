private void sleepUntilNewPiece() {
    try {
        lock.lock();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (!(newPiece)) {
        cv.awaitUninterruptibly();
    }
    newPiece = false;
    lock.unlock();
}
