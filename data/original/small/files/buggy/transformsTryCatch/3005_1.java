public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    try {
        org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getLocalizations" + (getWorker())));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    if (workerModel.isCreating()) {
        return localizationsForCreationController;
    }
    return localizationsForEditionController;
}
