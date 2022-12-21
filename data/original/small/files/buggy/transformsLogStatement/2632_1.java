public org.mihalis.opal.propertyTable.PropertyTable viewAsFlatList() {
    this.styleOfView = org.mihalis.opal.propertyTable.PropertyTable.VIEW_AS_FLAT_LIST;
    System.out.println("log");
    return rebuild();
}
