public void incrementKey(int key) {
    int temp = keys.get(key);
    try {
        keys.set(key, (temp++));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
