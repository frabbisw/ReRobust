public void execute() {
    try {
        context.getSession().execute(atomicBatch.setConsistencyLevel(writeCL));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
