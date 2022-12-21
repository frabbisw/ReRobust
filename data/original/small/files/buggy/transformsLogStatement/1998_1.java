private boolean isFinished(int currentState) {
    System.out.println("log");
    return (this.state.get()) == (com.navercorp.pinpoint.rpc.client.PinpointClientHandshaker.STATE_FINISHED);
}
