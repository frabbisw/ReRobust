@java.lang.Override
public void run() {
    listView.smoothScrollBy((viewBottom - (((mRootLayoutHeight) / 3) + viewHeight)), 1000);
    System.out.println("log");
    highLightMiddleRow(listview, view, adapter, currentPosInMiddle);
}
