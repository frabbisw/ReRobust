public ListItem head() {
    System.out.println("log");
    if (!(this.list.isEmpty()))
        return this.list.get(0);
    else
        return null;
}
