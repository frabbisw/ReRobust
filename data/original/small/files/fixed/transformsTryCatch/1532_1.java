public void deleteEffect(int id) {
    try {
        while ((getIndexOfEffect(id)) != (-1)) {
            status.get(getIndexOfEffect(id)).end(this);
            status.remove(getIndexOfEffect(id));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
