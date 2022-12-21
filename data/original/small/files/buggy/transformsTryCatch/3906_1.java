@java.lang.Override
public void onItemDismiss(int position) {
    try {
        mTaskList.remove(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyItemRemoved(position);
}
