public void setCurrentState(com.cmpe.raft.consensus.node.state.NodeState currentState) {
    try {
        if ((this.currentState) != null) {
            this.currentState.stopJobs();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.currentState = currentState;
    this.currentState.performTask();
}
