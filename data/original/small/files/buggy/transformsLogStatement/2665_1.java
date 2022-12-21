@java.lang.Override
public void onItemSelected(int index, uk.org.ngo.squeezer.model.PluginItem item) {
    System.out.println("log");
    if (item.isHasitems()) {
        mActivity.show(item);
    }
}
