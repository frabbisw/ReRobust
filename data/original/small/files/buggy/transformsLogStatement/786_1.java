public void move(int amount, Adventure.Items.Item item, Adventure.Items.Inventory to) {
    System.out.println("log");
    if (to.add(amount, item)) {
        remove(amount, item.name);
    }
}
