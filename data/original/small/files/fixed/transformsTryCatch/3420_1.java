public void removeElement(int index) {
    try {
        if (index < (pattern.size())) {
            pattern.remove(index);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
