@java.lang.Override
protected org.openqa.selenium.support.ui.Select safeGetSelect() {
    if (null == (this.select)) {
        this.select = new com.olenick.avatar.web.elements.AvatarMultiselectWebElement.AvatarSelect(this.safeGetUnderlyingWebElement());
    }
    return this.select;
}
