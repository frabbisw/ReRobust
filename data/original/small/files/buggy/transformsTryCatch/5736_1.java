@java.lang.Override
public void onLastItemVisible() {
    int page = ((mListAdapter.getCount()) / (com.xiaomei.yanyu.api.util.Constant.PERPAGE)) + 1;
    try {
        mQueue.add(new com.android.volley.toolbox.StringRequest(getTopicListUrl(page), mRefreshMoreListener, mRefreshErroListener));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
