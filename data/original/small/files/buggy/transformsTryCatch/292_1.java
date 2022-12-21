@java.lang.Override
public void run() {
    try {
        listAdapter.notifyDataSetChanged();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    recyclerView.smoothScrollToPosition(((checkpoints.size()) - 1));
}
