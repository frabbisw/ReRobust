public int indexOf(E e) {
    try {
        if ((headLink) == null)
            return -1;
        else
            return headLink.indexOf(e, 0);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
