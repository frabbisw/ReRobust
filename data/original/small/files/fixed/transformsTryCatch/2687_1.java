public void RefreshGraph(br.uff.ic.provviewer.Variables variables) {
    CollapseEdges(variables);
    variables.filter.RemoveFilters(variables);
    try {
        variables.view.repaint();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
