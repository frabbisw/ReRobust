public void isFavCallBack() {
    try {
        if (mControl.getModel().ismIsFav()) {
            mTitleBar.findViewById(R.id.fav).setActivated(true);
        } else {
            mTitleBar.findViewById(R.id.fav).setActivated(false);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
