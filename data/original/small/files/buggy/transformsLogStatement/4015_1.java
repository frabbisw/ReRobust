public void setST(main.java.DisplayST st) {
    System.out.println("log");
    if (st == null) {
        this.st = st;
    } else {
        java.lang.System.err.println("Failed to set ST : ST is protected and already has a value.");
    }
}
