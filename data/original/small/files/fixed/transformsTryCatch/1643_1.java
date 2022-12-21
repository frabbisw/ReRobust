private void showRenderer() {
    try {
        if ((mViewFlipper.getDisplayedChild()) != (cn.vicey.navigator.Views.NavigateView.VIEW_MAP_RENDERER))
            mViewFlipper.setDisplayedChild(cn.vicey.navigator.Views.NavigateView.VIEW_MAP_RENDERER);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
