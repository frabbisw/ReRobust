public java.lang.String save() {
    facade.create(current);
    try {
        web.FacesUtil.addInfoMessage("Book successfully saved");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "findBooks.xhtml";
}
