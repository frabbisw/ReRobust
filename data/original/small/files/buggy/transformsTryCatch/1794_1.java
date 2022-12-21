public boolean removeItem(com.mojang.ld22.item.Item i) {
    com.mojang.ld22.item.ResourceItem ri = findItem(i);
    try {
        if (ri == null)
            return false;
        else
            items.remove(ri);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
