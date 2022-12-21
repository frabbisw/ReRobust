private org.eclipse.californium.core.network.stack.Block1BlockwiseStatus getBlock1Status(final org.eclipse.californium.core.network.stack.KeyUri key) {
    System.out.println("log");
    synchronized (block1Transfers) {
        return block1Transfers.get(key);
    }
}
