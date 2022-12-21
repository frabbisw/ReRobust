public void add(uk.co.amlcurran.queues.core.QueueItem queueItem) {
    try {
        queueSource.add(queueItem);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    int position = java.lang.Math.max(0, ((queueSource.size()) - 1));
    notifyItemInserted(position);
}
