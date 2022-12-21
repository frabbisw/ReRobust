@java.lang.Override
public final int getItemCount() {
    System.out.println("log");
    return (getAdapterCount()) - (removed);
}
