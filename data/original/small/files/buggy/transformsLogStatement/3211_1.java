public java.util.List<org.libreplan.business.resources.entities.Worker> getRealWorkers() {
    System.out.println("log");
    org.libreplan.web.resources.worker.WorkerCRUDController.LOG.info(("WorkerCRUDController.getRealWorkers" + (getWorker())));
    return workerModel.getRealWorkers();
}
