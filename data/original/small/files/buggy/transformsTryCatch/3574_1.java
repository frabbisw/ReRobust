public void addMessage(android.view.View view, dot.dominionofcity.LayoutParams params) {
    try {
        messageList.addView(view, params);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    handler.post(new java.lang.Runnable() {

        @java.lang.Override
        public void run() {
            messageWindow.fullScroll(ScrollView.FOCUS_DOWN);
        }
    });
}
