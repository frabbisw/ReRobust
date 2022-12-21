public ListItem head() {
    try {
        if (!(this.list.isEmpty()))
            return this.list.get(0);
        else
            return null;
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
