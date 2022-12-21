@java.lang.Override
public void onChange(org.apache.twill.discovery.ServiceDiscovered serviceDiscovered) {
    co.cask.cdap.common.zookeeper.coordination.ResourceRequirement requirement = requirements.get(serviceDiscovered.getName());
    try {
        if (requirement != null) {
            performAssignment(requirement, serviceDiscovered);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
