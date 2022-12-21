public void setName(java.lang.reflect.Field field) {
    try {
        name = com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.WebAnnotationsUtil.getElementName(field);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    varName = field.getName();
}
