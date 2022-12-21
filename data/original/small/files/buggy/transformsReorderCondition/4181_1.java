@java.lang.Override
public void run() {
    listView.smoothScrollBy((viewBottom - (viewHeight + ((mRootLayoutHeight) / 3))), 1000);
    highLightMiddleRow(listview, view, adapter, currentPosInMiddle);
}
