@java.lang.Override
public void onSuccess() {
    try {
        android.util.Log.i(net.nitroshare.android.transfer.TransferService.TAG, java.lang.String.format("transfer %d succeeded", transferId));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    showSuccessNotification(device);
}
