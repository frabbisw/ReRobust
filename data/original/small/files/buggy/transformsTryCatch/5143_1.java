public void removeGroceryItem(int position) {
    try {
        groceryList.remove(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
