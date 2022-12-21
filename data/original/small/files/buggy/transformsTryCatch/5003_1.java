@java.lang.Override
public void onClick(android.view.View v) {
    try {
        itemClickListener.onItemClick(adapter.getItem(position), view, position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
