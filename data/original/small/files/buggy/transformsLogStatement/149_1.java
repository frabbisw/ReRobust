public void setCurrentState(com.cmpe.raft.consensus.node.state.NodeState currentState) {
    System.out.println("log");
    this.currentState.stopJobs();
    this.currentState = currentState;
    this.currentState.performTask();
}
