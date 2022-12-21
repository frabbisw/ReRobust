@java.lang.Override
public void onPageSelected(int position) {
    if (position == 0) {
        title.setText(R.string.title_myBook);
    } else if (position == 1) {
        title.setText(R.string.title_allBook);
    } else {
        title.setText(R.string.title_allBook);
    }
}
