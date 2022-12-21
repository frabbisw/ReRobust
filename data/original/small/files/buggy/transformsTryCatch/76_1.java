@java.lang.Override
public void onNotificationClicked(java.util.List<com.gimbal.android.Communication> communications) {
    try {
        for (com.gimbal.android.Communication communication : communications) {
            if (communication != null) {
                addEvent(java.lang.String.format("Communication Clicked"));
            }
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
