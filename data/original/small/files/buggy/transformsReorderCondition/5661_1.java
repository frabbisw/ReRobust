public void updateUI(com.handup.handup.model.Content c) {
    if (null != (mRecyclerViewAdapter)) {
        for (int i = 0; i < 20; ++i) mRecyclerViewAdapter.addItem(c);
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
}
