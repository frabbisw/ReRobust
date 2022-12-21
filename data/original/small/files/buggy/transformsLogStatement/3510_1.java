@java.lang.Override
public void timeUp() {
    System.out.println("log");
    if (running)
        throw new java.lang.IllegalStateException();
    running = false;
}
