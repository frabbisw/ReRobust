public void move(int amount, Adventure.Items.Item item, Adventure.Items.Inventory to) {
    try {
        if (to.add(amount, item)) {
            remove(amount, item.name);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
