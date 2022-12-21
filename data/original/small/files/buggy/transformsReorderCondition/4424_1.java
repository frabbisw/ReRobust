public icsetlv.trial.model.TraceNode getLastestNode() {
    int len = (size()) - 1;
    if (0 < len) {
        return this.exectionList.get(len);
    } else {
        return null;
    }
}
