public void isFavCallBack() {
    try {
        if (mControl.getModel().ismIsFav()) {
            mTitleBar.findViewById(R.id.fav).setActivated(true);
            mTitleBar.findViewById(R.id.fav).setOnClickListener(null);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
