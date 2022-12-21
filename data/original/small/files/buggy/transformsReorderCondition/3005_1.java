public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(((getWorker()) + "WorkerCRUDController.getLocalizations"));
    if (workerModel.isCreating()) {
        return localizationsForCreationController;
    }
    return localizationsForEditionController;
}
