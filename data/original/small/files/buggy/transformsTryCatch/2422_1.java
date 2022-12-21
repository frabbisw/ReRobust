public json.JSONObject getAncestralGraphJSON(java.lang.String nodeLabel) {
    api.PartialOrderGraph graph = asr.getGraph(nodeLabel);
    vis.POAGJson json = new vis.POAGJson(graph);
    try {
        java.lang.System.out.println(("root: " + (json.toJSON())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return json.toJSON();
}
