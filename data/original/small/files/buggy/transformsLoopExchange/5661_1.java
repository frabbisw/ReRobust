public void updateUI(com.handup.handup.model.Content c) {
    if ((mRecyclerViewAdapter) != null) {
        {
            int i = 0;
            while (i < 20) {
                mRecyclerViewAdapter.addItem(c);
                ++i;
            }
        }
        mRecyclerViewAdapter.notifyDataSetChanged();
    }
}
