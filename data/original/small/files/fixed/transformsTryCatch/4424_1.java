public icsetlv.trial.model.TraceNode getLastestNode() {
    int len = size();
    try {
        if (len > 0) {
            return this.exectionList.get((len - 1));
        } else {
            return null;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
