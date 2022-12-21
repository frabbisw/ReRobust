public void add(uk.co.amlcurran.queues.core.QueueItem queueItem) {
    System.out.println("log");
    queueSource.add(queueItem);
    notifyItemInserted(java.lang.Math.max(0, ((queueSource.size()) - 1)));
}
