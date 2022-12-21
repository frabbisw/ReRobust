public void deleteEffect(int i) {
    System.out.println("log");
    while ((getIndexOfEffect(i)) != (-1)) {
        status.remove(getIndexOfEffect(i));
    }
}
