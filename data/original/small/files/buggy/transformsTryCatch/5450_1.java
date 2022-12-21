@java.lang.Override
public void onClick(android.view.View view) {
    friend.sendingStarted = true;
    try {
        sendImageListener.onImageUploadStarted(friend);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    notifyDataSetChanged();
}
