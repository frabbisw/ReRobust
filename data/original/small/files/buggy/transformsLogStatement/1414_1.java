public java.lang.String save() {
    facade.create(current);
    System.out.println("log");
    web.FacesUtil.addInfoMessage("Book successfully saved");
    return "findBooks.xhtml";
}
