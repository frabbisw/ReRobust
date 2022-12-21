public void setCurrentState(com.cmpe.raft.consensus.node.state.NodeState currentState) {
    this.currentState.stopJobs();
    this.currentState = currentState;
    try {
        this.currentState.performTask();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
