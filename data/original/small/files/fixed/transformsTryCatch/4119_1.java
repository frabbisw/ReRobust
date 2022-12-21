public void setEdges(com.company.DataStructure.Node<T> child) {
    try {
        if (!(getEdges().contains(child))) {
            getEdges().add(child);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
