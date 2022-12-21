@java.lang.Override
public void run() {
    try {
        highLightMiddleRow(listview, view, adapter, currentPosInMiddle);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    listView.smoothScrollBy((viewBottom - (((mRootLayoutHeight) / 3) + viewHeight)), 1000);
}
