static void stopTransfer(int transferId) {
    net.nitroshare.android.transfer.TransferWrapper transferWrapper = net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers.get(transferId);
    try {
        if (transferWrapper != null) {
            transferWrapper.mTransfer.stop();
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
