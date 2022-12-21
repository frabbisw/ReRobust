private void replaceConnection(com.datastax.driver.core.Connection connection) {
    try {
        if (!(connection.state.compareAndSet(State.OPEN, State.TRASHED)))
            open.set(false);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    maybeSpawnNewConnection();
    doTrashConnection(connection);
}
