public boolean canResume() {
    try {
        if (isTerminated())
            return false;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return isSuspended();
}
