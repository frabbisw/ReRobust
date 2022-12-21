@java.lang.Override
public rioko.drawmodels.configurations.LayoutAlgorithmConfiguration copy() {
    rioko.drawmodels.configurations.LayoutAlgorithmConfiguration res = new rioko.drawmodels.configurations.LayoutAlgorithmConfiguration();
    try {
        res.currentAlgorithm = res.algorithms.get(this.indexOf(this.currentAlgorithm));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return res;
}
