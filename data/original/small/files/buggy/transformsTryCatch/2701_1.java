public void onClickSetPathUp(android.view.View view) {
    try {
        mProfileService.getMapClient(mMasInstanceId).setFolderUp();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
}
