void nodeEntry() {
    try {
        if (!(this.failureFree)) {
            initialization();
            entryRequest();
            for (java.lang.Integer node : testerOf) {
                performTest(node);
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
