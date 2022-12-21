public void setElements(int arrayResourceId, boolean[] selected) {
    try {
        setElements(this.getResources().getStringArray(arrayResourceId), null, selected);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
