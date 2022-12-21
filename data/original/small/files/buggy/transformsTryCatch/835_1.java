public void addItems(java.util.ArrayList<Model.GameObject.Item.Item> items) {
    try {
        for (Model.GameObject.Item.Item i : items) {
            this.items.add(i);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    alert();
}
