@java.lang.Override
public void onItemDismiss(int position) {
    try {
        if ((mTaskList.size()) > 0) {
            mTaskList.remove(position);
            notifyItemRemoved(position);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
