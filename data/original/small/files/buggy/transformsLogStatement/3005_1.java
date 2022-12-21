public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getLocalizations" + (getWorker())));
    System.out.println("log");
    if (workerModel.isCreating()) {
        return localizationsForCreationController;
    }
    return localizationsForEditionController;
}
