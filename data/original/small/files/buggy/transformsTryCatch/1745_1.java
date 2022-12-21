public void add(int addable) {
    try {
        if (addable >= 0) {
            stat += addable;
            modelNotifyObservers();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
