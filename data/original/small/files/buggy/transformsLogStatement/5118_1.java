@javax.annotation.PostConstruct
public void init() {
    username = javax.faces.context.FacesContext.getCurrentInstance().getExternalContext().getRemoteUser();
    System.out.println("log");
    logger.debug(("username en cours : " + (username)));
}
