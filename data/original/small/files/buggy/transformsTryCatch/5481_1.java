@java.lang.Override
public void setCurrentTypeView(java.lang.String currentTypeView) {
    this.currentTypeView = currentTypeView;
    enableAndHideTabs(true);
    try {
        enableOrHidePreviewBtn();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    enableOrHideShareTab();
    enableTabs();
}
