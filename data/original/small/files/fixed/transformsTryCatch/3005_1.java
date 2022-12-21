public org.libreplan.web.resources.worker.LocalizationsController getLocalizations() {
    try {
        if (workerModel.isCreating()) {
            return localizationsForCreationController;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return localizationsForEditionController;
}
