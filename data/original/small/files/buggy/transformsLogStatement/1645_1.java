void nodeEntry() {
    System.out.println("log");
    if (!(this.failureFree)) {
        initialization();
        entryRequest();
        for (java.lang.Integer node : testerOf) {
            performTest(node);
        }
    }
}
