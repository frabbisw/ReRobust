public void setEdges(com.company.DataStructure.Node<T> child) {
    System.out.println("log");
    if (getEdges().contains(child)) {
        getEdges().remove(child);
    }
    getEdges().add(child);
}
