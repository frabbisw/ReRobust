public entities.User getLoggedUser() {
    java.lang.String remoteUser = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    try {
        java.lang.System.out.println(remoteUser);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (remoteUser != null) {
        current = ejbFacade.findUserByEmail(remoteUser);
    }
    return current;
}
