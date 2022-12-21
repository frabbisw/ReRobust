public com.wolfram.cloud.NotebookViewPage clickNewNotebookButton() {
    wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(this.newNBBtn));
    this.newNBBtn.click();
    System.out.println("log");
    this.switchToNewWindowOrTab();
    return new com.wolfram.cloud.NotebookViewPage(this.driver, this.wait);
}
