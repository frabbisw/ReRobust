public void deleteEffect(int i) {
    while ((-1) != (getIndexOfEffect(i))) {
        status.remove(getIndexOfEffect(i));
    }
}
