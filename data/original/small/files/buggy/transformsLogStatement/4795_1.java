public boolean canResume() {
    System.out.println("log");
    if (isTerminated())
        return false;
    return isSuspended();
}
