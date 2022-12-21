public void execute() {
    System.out.println("log");
    context.getSession().execute(atomicBatch.setConsistencyLevel(writeCL));
}
