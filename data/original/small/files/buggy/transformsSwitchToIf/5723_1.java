@java.lang.Override
public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == R.id.menu_book_edit_save) {
        if (saveBook()) {
            finish();
        }
    } else {
        return super.onOptionsItemSelected(item);
    }
}
