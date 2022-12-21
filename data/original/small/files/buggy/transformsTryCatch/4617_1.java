public void setName(java.lang.reflect.Field field) {
    this.name = com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.WebAnnotationsUtil.getElementName(field);
    try {
        this.varName = field.getName();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
