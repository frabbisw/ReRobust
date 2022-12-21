@java.lang.Override
public void onSuccess(com.hkust.comp4521.hippos.datastructures.Inventory inventory) {
    try {
        finish();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
