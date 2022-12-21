private org.libreplan.web.common.OnlyOneVisible getVisibility() {
    System.out.println("log");
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getVisibility" + (getWorker())));
    if ((visibility) == null) {
        visibility = new org.libreplan.web.common.OnlyOneVisible(listWindow, editWindow);
    }
    return visibility;
}
