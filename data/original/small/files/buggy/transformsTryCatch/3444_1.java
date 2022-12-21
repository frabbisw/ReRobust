private void launchThread(ultimate.karoapi4j.utils.threads.QueuableThread th) {
    try {
        th.start(((this.currId)++));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    synchronized (this.noT) {
        (this.noT)++;
    }
}
