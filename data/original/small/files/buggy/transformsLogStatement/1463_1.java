public void dispose() {
    System.out.println("log");
    if ((getParent()) != null)
        getParent().remove(this);
}
