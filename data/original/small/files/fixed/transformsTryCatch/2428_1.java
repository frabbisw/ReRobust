@java.lang.Override
public void onSucceeded(org.ovirt.engine.core.compat.Guid cmdId, java.util.List<org.ovirt.engine.core.compat.Guid> childCmdIds) {
    super.onSucceeded(cmdId, childCmdIds);
    try {
        log.info("Disk has been successfully added to Cinder. ID: {}", getDiskId());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    getCommand().endAction();
    org.ovirt.engine.core.bll.tasks.CommandCoordinatorUtil.removeAllCommandsInHierarchy(cmdId);
}
