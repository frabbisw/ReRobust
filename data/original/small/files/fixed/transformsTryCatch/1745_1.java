public void add(int addable) {
    stat += addable;
    try {
        modelNotifyObservers();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
