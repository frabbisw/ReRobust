public void onClickSetPathUp(android.view.View view) {
    try {
        if (((mProfileService) != null) && ((mProfileService.getMapClient(mMasInstanceId)) != null)) {
            mProfileService.getMapClient(mMasInstanceId).setFolderUp();
            goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
