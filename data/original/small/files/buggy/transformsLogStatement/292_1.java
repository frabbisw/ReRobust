@java.lang.Override
public void run() {
    System.out.println("log");
    listAdapter.notifyDataSetChanged();
    recyclerView.smoothScrollToPosition(((checkpoints.size()) - 1));
}
