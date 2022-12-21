public boolean contains(java.lang.String ID) {
    nu.xom.Element e = getElementByID(ID);
    boolean res = true;
    if (e != null) {
        res = false;
    }
    return !(res);
}
