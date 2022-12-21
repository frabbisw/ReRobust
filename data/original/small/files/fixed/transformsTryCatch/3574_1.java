public void addMessage(android.view.View view) {
    try {
        messageList.addView(view);
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
