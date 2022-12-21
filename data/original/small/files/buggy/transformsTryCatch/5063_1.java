public void action(org.primefaces.event.SelectEvent event) {
    org.primefaces.context.RequestContext rc = org.primefaces.context.RequestContext.getCurrentInstance();
    modelloMF = "";
    numeroRapportoProva = "";
    try {
        ditta = ((isti.cnr.sse.rest.data.Ditta) (event.getObject()));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
