@java.lang.Override
public void conComplete() {
    pmdisk.deregisterObject(savedmemory);
    cleanUpIntermediateData();
    setState(hu.mta.sztaki.lpds.cloud.simulator.iaas.VirtualMachine.State.RUNNING);
    try {
        resumeTasks();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
