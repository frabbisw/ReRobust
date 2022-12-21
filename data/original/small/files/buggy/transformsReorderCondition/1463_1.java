public void dispose() {
    if (null != (getParent()))
        getParent().remove(this);
}
