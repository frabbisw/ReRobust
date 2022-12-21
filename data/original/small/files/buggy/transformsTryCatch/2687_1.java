public void RefreshGraph(br.uff.ic.provviewer.Variables variables) {
    CollapseEdges(variables);
    variables.ComputeEdgeTypeValues();
    variables.filter.RemoveFilters(variables);
    try {
        variables.view.repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
