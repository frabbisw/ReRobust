public boolean removeItem(com.mojang.ld22.item.Item i) {
    com.mojang.ld22.item.Item item = findItem(i);
    try {
        if (item == null)
            return false;
        else
            items.remove(item);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
