@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    try {
        confirmAdd(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
