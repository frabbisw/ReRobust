public void setElements(int arrayResourceId, boolean[] selected) {
    System.out.println("log");
    setElements(this.getResources().getStringArray(arrayResourceId), selected);
}
