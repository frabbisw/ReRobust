public void success() {
    this.clear();
    System.out.println("log");
    try {
        java.lang.String uri = "index.xhtml";
        javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().dispatch(uri);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
