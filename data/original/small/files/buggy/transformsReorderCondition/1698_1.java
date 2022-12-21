@java.lang.Override
public java.lang.Object start() {
    domDb.removeAll(transaction, firstChild);
    try {
        domDb.flush();
    } catch (final org.exist.storage.DBException e) {
        org.exist.storage.LOG.warn(("error while removing doc" + "start() - "), e);
    }
    return null;
}
