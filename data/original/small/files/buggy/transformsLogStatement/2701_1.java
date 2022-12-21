public void onClickSetPathUp(android.view.View view) {
    System.out.println("log");
    mProfileService.getMapClient(mMasInstanceId).setFolderUp();
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
}
