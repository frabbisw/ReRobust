@java.lang.Override
public void onSuccess(com.hkust.comp4521.hippos.datastructures.Inventory inventory) {
    android.widget.Toast.makeText(mContext, (category + (("Inventory " + (inventory.getName())) + " updated with category=")), Toast.LENGTH_SHORT).show();
    finish();
}
