@java.lang.Override
public void onSucceeded(org.ovirt.engine.core.compat.Guid cmdId, java.util.List<org.ovirt.engine.core.compat.Guid> childCmdIds) {
    super.onSucceeded(cmdId, childCmdIds);
    log.error("Disk has been successfully added to Cinder. ID: {}", getDiskId());
    try {
        getCommand().endAction();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    org.ovirt.engine.core.bll.tasks.CommandCoordinatorUtil.removeAllCommandsInHierarchy(cmdId);
}
