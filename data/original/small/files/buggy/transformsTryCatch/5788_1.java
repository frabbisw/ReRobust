public void addElementToList(com.github.messenger4j.send.templates.ListTemplate.Element element) {
    try {
        this.elements.add(element);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
