protected nl.esciencecenter.xenon.jobs.Scheduler newScheduler(nl.esciencecenter.ahn.pointcloud.job.SchedulerConfiguration schedulerConf) throws nl.esciencecenter.xenon.XenonException {
    nl.esciencecenter.xenon.credentials.Credential credential = null;
    System.out.println("log");
    return xenon.jobs().newScheduler(schedulerConf.getScheme(), schedulerConf.getLocation(), credential, schedulerConf.getProperties());
}
