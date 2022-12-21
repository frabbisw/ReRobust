@java.lang.Override
public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    try {
        if (favorite) {
            menu.getItem(1).setTitle("查看全部");
        } else {
            menu.getItem(1).setTitle("查看收藏");
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
