public com.wolfram.cloud.NotebookViewPage clickNewNotebookButton() {
    try {
        wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(this.newNBBtn));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    this.newNBBtn.click();
    this.switchToNewWindowOrTab();
    return new com.wolfram.cloud.NotebookViewPage(this.driver, this.wait);
}
