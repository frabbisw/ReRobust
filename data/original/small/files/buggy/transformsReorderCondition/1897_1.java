@java.lang.Override
public void onChange(org.apache.twill.discovery.ServiceDiscovered serviceDiscovered) {
    co.cask.cdap.common.zookeeper.coordination.ResourceRequirement requirement = requirements.get(serviceDiscovered.getName());
    if (null != requirement) {
        performAssignment(requirement, com.google.common.collect.ImmutableSortedSet.copyOf(DiscoverableComparator.COMPARATOR, serviceDiscovered));
    }
}
