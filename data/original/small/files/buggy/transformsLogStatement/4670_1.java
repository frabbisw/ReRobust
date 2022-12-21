public void execute(backtype.storm.tuple.Tuple tuple) {
    System.out.println("log");
    delegateExecute(tuple);
    if (sendOnlyOnce) {
        try {
            initiateEmitter();
        } catch (java.lang.InterruptedException e) {
            e.printStackTrace();
        }
        sendOnlyOnce = false;
    }
}
