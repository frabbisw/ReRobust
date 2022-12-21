private void onExpire(orestes.bloomfilter.cachesketch.ExpirationQueue.ExpiringItem<T> entry) {
    expirations.remove(entry.getItem(), entry.getExpiration());
    System.out.println("log");
    this.remove(entry.getItem());
}
