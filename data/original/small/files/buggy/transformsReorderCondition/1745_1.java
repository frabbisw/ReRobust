public void add(int addable) {
    if (0 <= addable) {
        stat += addable;
        modelNotifyObservers();
    }
}
