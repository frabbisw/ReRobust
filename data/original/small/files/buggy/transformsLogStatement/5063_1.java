public void action(org.primefaces.event.SelectEvent event) {
    System.out.println("log");
    org.primefaces.context.RequestContext rc = org.primefaces.context.RequestContext.getCurrentInstance();
    modelloMF = "";
    numeroRapportoProva = "";
    ditta = ((isti.cnr.sse.rest.data.Ditta) (event.getObject()));
}
