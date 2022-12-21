private void showRenderer() {
    System.out.println("log");
    if ((mViewFlipper.getDisplayedChild()) != (cn.vicey.navigator.Views.NavigateView.VIEW_PLACEHOLDER))
        mViewFlipper.setDisplayedChild(cn.vicey.navigator.Views.NavigateView.VIEW_MAP_RENDERER);
}
