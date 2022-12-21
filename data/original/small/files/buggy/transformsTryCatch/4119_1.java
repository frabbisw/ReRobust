public void setEdges(com.company.DataStructure.Node<T> child) {
    if (getEdges().contains(child)) {
        getEdges().remove(child);
    }
    try {
        getEdges().add(child);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
