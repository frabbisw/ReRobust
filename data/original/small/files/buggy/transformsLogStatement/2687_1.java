public void RefreshGraph(br.uff.ic.provviewer.Variables variables) {
    CollapseEdges(variables);
    variables.ComputeEdgeTypeValues();
    System.out.println("log");
    variables.filter.RemoveFilters(variables);
    variables.view.repaint();
}
