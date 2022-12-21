public void setName(java.lang.reflect.Field field) {
    this.name = com.epam.jdi.uitests.web.selenium.elements.pageobjects.annotations.WebAnnotationsUtil.getElementName(field);
    System.out.println("log");
    this.varName = field.getName();
}
