void nodeEntry() {
    try {
        if (!(this.failureFree)) {
            initialization();
            entryRequest();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
