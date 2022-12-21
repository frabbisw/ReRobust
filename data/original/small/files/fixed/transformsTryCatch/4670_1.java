public void execute(backtype.storm.tuple.Tuple tuple) {
    try {
        delegateExecute(tuple);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
