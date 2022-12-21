@java.lang.Override
public void onTagDiscovered(android.nfc.Tag tag) {
    android.util.Log.i(com.chariotsolutions.nfc.plugin.NfcPlugin.TAG, ("onTagDiscovered " + tag));
    try {
        super.onTagDiscovered(tag);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    savedTag = tag;
    handleTag();
}
