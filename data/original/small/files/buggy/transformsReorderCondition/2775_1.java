public boolean contains(java.lang.String ID) {
    nu.xom.Element e = getElementByID(ID);
    boolean res = false;
    if (null != e) {
        res = true;
    }
    return res;
}
