private void launchThread(ultimate.karoapi4j.utils.threads.QueuableThread th) {
    th.start(((this.currId)++));
    System.out.println("log");
    synchronized (this.noT) {
        (this.noT)++;
    }
}
