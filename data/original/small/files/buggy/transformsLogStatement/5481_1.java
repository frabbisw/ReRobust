@java.lang.Override
public void setCurrentTypeView(java.lang.String currentTypeView) {
    this.currentTypeView = currentTypeView;
    System.out.println("log");
    enableAndHideTabs(true);
    enableOrHidePreviewBtn();
    enableOrHideShareTab();
    enableTabs();
}
