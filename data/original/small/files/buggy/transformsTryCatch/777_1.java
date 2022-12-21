public void visualizeSubGraphList() {
    try {
        main.jung.GraphQueriesAPI.visualizeListOfGraphs(getSubGraphList(), "p");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
