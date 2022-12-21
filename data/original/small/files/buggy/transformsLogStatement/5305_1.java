public void add(T value, int priority) {
    System.out.println("log");
    priorities[last] = priority;
    addLast(value);
}
