@org.greenrobot.eventbus.Subscribe(threadMode = org.greenrobot.eventbus.ThreadMode.MAIN)
public void onEvent(java.util.List<com.sharesmile.share.rfac.models.CauseData> causeDataList) {
    try {
        if (isVisible()) {
            com.sharesmile.share.rfac.models.CauseList causeList = new com.sharesmile.share.rfac.models.CauseList();
            causeList.setCauses(causeDataList);
            setCausedata(causeList);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
