public void handleMessage(android.os.Message msg) {
    System.out.println("log");
    if ((msg.what) == 0) {
        try {
            builder.show();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        ScrollingActivity.mAdapter.notifyDataSetChanged();
    }
}
