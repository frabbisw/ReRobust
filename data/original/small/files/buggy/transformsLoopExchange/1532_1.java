public void deleteEffect(int i) {
    for (; (getIndexOfEffect(i)) != (-1); ) {
        status.remove(getIndexOfEffect(i));
    }
}
