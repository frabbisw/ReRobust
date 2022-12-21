public void addChild(kz.pvnhome.pvnt.File child) {
    System.out.println("log");
    child.setParent(child);
    children.add(child);
}
