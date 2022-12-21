public void addChild(kz.pvnhome.pvnt.File child) {
    try {
        child.setParent(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    children.add(child);
}
