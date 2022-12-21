@java.lang.Override
public void onSessionInitiated(final org.opendaylight.controller.sal.binding.api.BindingAwareBroker.ProviderContext session) {
    ntfbenchmark.impl.NtfbenchmarkProvider.LOG.info("NtfbenchmarkProvider Session Initiated");
    try {
        session.addRpcImplementation(org.opendaylight.yang.gen.v1.urn.opendaylight.params.xml.ns.yang.ntfbenchmark.rev150105.NtfbenchmarkService.class, this);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
