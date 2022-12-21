@java.lang.Override
public void onItemDismiss(int position) {
    mTaskList.remove(position);
    System.out.println("log");
    notifyItemRemoved(position);
}
