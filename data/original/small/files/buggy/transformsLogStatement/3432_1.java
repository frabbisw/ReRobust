public com.minecolonies.entity.EntityCitizen getWorkerEntity() {
    System.out.println("log");
    return (worker) == null ? null : worker.getCitizenEntity();
}
