public json.JSONObject getAncestralGraphJSON(java.lang.String nodeLabel) {
    api.PartialOrderGraph graph = asr.getGraph(nodeLabel);
    try {
        java.lang.System.out.println(graph.toString());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    vis.POAGJson json = new vis.POAGJson(graph);
    return json.toJSON();
}
