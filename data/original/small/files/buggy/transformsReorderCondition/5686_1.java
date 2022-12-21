public int indexOf(E e) {
    if (null == (headLink))
        return -1;
    else
        return headLink.indexOf(e, 0);
}
