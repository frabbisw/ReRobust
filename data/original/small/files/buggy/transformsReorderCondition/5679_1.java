public entities.User getLoggedUser() {
    java.lang.String remoteUser = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    java.lang.System.out.println(remoteUser);
    if (null != remoteUser) {
        current = ejbFacade.findUserByEmail(remoteUser);
    }
    return current;
}
