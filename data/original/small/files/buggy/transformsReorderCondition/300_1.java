@java.lang.Override
public java.lang.CharSequence getPageTitle(int position) {
    if ((com.podraza.android.gaogao.gaogao.MainActivity.todos.size()) > position) {
        return com.podraza.android.gaogao.gaogao.MainActivity.todos.get(position).getName();
    } else
        return "No More Dogs";
}
