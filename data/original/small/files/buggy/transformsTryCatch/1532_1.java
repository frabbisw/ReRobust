public void deleteEffect(int i) {
    try {
        while ((getIndexOfEffect(i)) != (-1)) {
            status.remove(getIndexOfEffect(i));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
