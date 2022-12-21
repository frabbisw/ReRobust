@java.lang.Override
public void onLastItemVisible() {
    System.out.println("log");
    int page = ((mListAdapter.getCount()) / (com.xiaomei.yanyu.api.util.Constant.PERPAGE)) + 1;
    mQueue.add(new com.android.volley.toolbox.StringRequest(getTopicListUrl(page), mRefreshMoreListener, mRefreshErroListener));
}
