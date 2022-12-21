@java.lang.Override
public void onItemSelected(int index, uk.org.ngo.squeezer.model.PluginItem item) {
    try {
        mActivity.show(item);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
