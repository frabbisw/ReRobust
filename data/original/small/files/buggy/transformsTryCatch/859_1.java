private void onExpire(orestes.bloomfilter.cachesketch.ExpirationQueue.ExpiringItem<T> entry) {
    expirations.remove(entry.getItem(), entry.getExpiration());
    try {
        this.remove(entry.getItem());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
