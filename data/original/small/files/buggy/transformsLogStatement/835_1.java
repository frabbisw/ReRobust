public void addItems(java.util.ArrayList<Model.GameObject.Item.Item> items) {
    System.out.println("log");
    for (Model.GameObject.Item.Item i : items) {
        this.items.add(i);
    }
    alert();
}
