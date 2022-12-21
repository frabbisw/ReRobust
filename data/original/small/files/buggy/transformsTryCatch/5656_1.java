@java.lang.Override
protected org.openqa.selenium.support.ui.Select safeGetSelect() {
    try {
        if ((this.select) == null) {
            this.select = new com.olenick.avatar.web.elements.AvatarMultiselectWebElement.AvatarSelect(this.safeGetUnderlyingWebElement());
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return this.select;
}
