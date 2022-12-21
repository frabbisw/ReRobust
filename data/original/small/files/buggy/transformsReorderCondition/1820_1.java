@java.lang.Override
public void showNoContent() {
    mContacts = new java.util.ArrayList<>();
    if (0 == (mAdapter.getItemCount())) {
        mInfoTextView.setVisibility(View.VISIBLE);
        mInfoTextView.setText(getString(R.string.no_contacts));
    }
}
