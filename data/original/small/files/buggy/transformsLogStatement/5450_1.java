@java.lang.Override
public void onClick(android.view.View view) {
    friend.sendingStarted = true;
    System.out.println("log");
    sendImageListener.onImageUploadStarted(friend);
    notifyDataSetChanged();
}
