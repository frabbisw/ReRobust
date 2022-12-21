public void add(T value, int priority) {
    priorities[last] = priority;
    try {
        addLast(value);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
