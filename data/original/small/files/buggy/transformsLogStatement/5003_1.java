@java.lang.Override
public void onClick(android.view.View v) {
    System.out.println("log");
    itemClickListener.onItemClick(adapter.getItem(position), view, position);
}
