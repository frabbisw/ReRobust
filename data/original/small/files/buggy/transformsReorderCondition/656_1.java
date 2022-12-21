private org.libreplan.web.common.OnlyOneVisible getVisibility() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(((getWorker()) + "WorkerCRUDController.getVisibility"));
    if ((visibility) == null) {
        visibility = new org.libreplan.web.common.OnlyOneVisible(listWindow, editWindow);
    }
    return visibility;
}
