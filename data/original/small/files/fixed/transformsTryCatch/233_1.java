public void deleteItem(com.codepath.simpletodo.Item item) {
    com.codepath.simpletodo.Item deletedItem = new com.codepath.simpletodo.Item(item.getId(), item.getText());
    try {
        deletedItem.delete();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
