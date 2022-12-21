protected org.eclipse.californium.core.network.stack.Block1BlockwiseStatus getBlock1Status(final org.eclipse.californium.core.network.stack.KeyUri key) {
    try {
        synchronized (block1Transfers) {
            return block1Transfers.get(key);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
