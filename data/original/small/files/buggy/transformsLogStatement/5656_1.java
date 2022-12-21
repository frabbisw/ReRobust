@java.lang.Override
protected org.openqa.selenium.support.ui.Select safeGetSelect() {
    System.out.println("log");
    if ((this.select) == null) {
        this.select = new com.olenick.avatar.web.elements.AvatarMultiselectWebElement.AvatarSelect(this.safeGetUnderlyingWebElement());
    }
    return this.select;
}
