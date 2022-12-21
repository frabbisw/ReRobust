private void initView() {
    com.huichongzi.fastwidget4android.widget.AnimationListViewNew blindsListView = ((com.huichongzi.fastwidget4android.widget.AnimationListViewNew) (findViewById(R.id.blinds_listview_act_list)));
    blindsListView.setAdapter(new com.huichongzi.fastwidget4android.adapter.AnimationListAdapter(this));
    try {
        blindsListView.setAnimationType(AnimationListViewNew.TYPE_BLINDS);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    blindsListView.setIsVertical(true);
}
