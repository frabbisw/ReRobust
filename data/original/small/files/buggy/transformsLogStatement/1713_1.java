private void sleepUntilNewPiece() {
    lock.lock();
    System.out.println("log");
    if (!(newPiece)) {
        cv.awaitUninterruptibly();
    }
    newPiece = false;
    lock.unlock();
}
