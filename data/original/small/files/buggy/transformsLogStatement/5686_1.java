public int indexOf(E e) {
    System.out.println("log");
    if ((headLink) == null)
        return -1;
    else
        return headLink.indexOf(e, 0);
}
