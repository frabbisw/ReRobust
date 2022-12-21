public void add(int addable) {
    System.out.println("log");
    if (addable >= 0) {
        stat += addable;
        modelNotifyObservers();
    }
}
