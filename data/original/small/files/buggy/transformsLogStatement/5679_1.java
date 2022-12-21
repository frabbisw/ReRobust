public entities.User getLoggedUser() {
    java.lang.String remoteUser = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    java.lang.System.out.println(remoteUser);
    System.out.println("log");
    if (remoteUser != null) {
        current = ejbFacade.findUserByEmail(remoteUser);
    }
    return current;
}
