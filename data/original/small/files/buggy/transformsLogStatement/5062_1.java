public void add() {
    com.iba.kozlov.web.writer.WriterController.LOGGER.info("add!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    if (false)
        org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('addWriter').hide()");
    System.out.println("log");
    facade.add();
}
