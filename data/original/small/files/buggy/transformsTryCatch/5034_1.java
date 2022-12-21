@java.lang.Override
public static void remove(com.managed.revenuetracker.to.Revenue revenue) {
    com.managed.revenuetracker.adapter.RevListAdapter.revenues.remove(revenue);
    notifyDataSetChanged();
    try {
        super.remove(revenue);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
