public void add() {
    com.iba.kozlov.web.writer.WriterController.LOGGER.info("add!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    try {
        if (false)
            org.primefaces.context.RequestContext.getCurrentInstance().execute("PF('addWriter').hide()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    facade.add();
}
