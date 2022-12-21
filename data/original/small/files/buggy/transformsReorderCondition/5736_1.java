@java.lang.Override
public void onLastItemVisible() {
    int page = 1 + ((mListAdapter.getCount()) / (com.xiaomei.yanyu.api.util.Constant.PERPAGE));
    mQueue.add(new com.android.volley.toolbox.StringRequest(getTopicListUrl(page), mRefreshMoreListener, mRefreshErroListener));
}
