public void replace(K oldKey, K newKey) {
    try {
        this.subMap.replaceKey(oldKey, newKey);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
