private synchronized void signal(int sectionNumber) {
    try {
        tsi.setSpeed(id, speed);
    } catch (CommandException e) {
        e.printStackTrace();
    }
    Train.critSems[sectionNumber].release();
    System.out.println("log");
    java.lang.System.err.println("Released");
}
