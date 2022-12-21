public void incrementKey(int key) {
    System.out.println("log");
    int temp = keys.get(key);
    keys.set(key, (temp++));
}
