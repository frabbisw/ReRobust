private org.libreplan.web.common.OnlyOneVisible getVisibility() {
    try {
        org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getVisibility" + (getWorker())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if ((visibility) == null) {
        visibility = new org.libreplan.web.common.OnlyOneVisible(listWindow, editWindow);
    }
    return visibility;
}
