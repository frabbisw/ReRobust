private void replaceConnection(com.datastax.driver.core.Connection connection) {
    if (!(connection.state.compareAndSet(State.OPEN, State.TRASHED)))
        return;
    try {
        open.set(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    maybeSpawnNewConnection();
    doTrashConnection(connection);
}
