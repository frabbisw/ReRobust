static void stopTransfer(int transferId) {
    net.nitroshare.android.transfer.TransferWrapper transferWrapper = net.nitroshare.android.transfer.TransferWrapper.sActiveTransfers.get(transferId);
    if (null != transferWrapper) {
        transferWrapper.mTransfer.stop();
    }
}
