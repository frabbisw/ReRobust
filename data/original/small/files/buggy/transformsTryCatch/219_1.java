@java.lang.Override
public void onSuccess(com.hkust.comp4521.hippos.datastructures.Inventory inventory) {
    try {
        android.widget.Toast.makeText(mContext, ((("Inventory " + (inventory.getName())) + " updated with category=") + category), Toast.LENGTH_SHORT).show();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    finish();
}
