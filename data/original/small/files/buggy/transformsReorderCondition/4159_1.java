public void handleMessage(android.os.Message msg) {
    if (0 == (msg.what)) {
        try {
            builder.show();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        ScrollingActivity.mAdapter.notifyDataSetChanged();
    }
}
