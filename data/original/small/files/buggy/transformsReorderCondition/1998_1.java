private boolean isFinished(int currentState) {
    return (com.navercorp.pinpoint.rpc.client.PinpointClientHandshaker.STATE_FINISHED) == (this.state.get());
}
