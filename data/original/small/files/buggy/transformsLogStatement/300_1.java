@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    System.out.println("log");
    if (position < (com.podraza.android.gaogao.gaogao.MainActivity.todos.size())) {
        return com.podraza.android.gaogao.gaogao.MainActivity.todos.get(position).getName();
    } else
        return "No More Dogs";
}