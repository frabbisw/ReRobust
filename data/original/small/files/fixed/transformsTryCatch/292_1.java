@java.lang.Override
public void run() {
    listAdapter.notifyDataSetChanged();
    try {
        if ((checkpoints.size()) > 0) {
            recyclerView.smoothScrollToPosition(((checkpoints.size()) - 1));
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
