public void addChild(kz.pvnhome.pvnt.File child) {
    child.setParent(this);
    try {
        children.add(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
