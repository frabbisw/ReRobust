@java.lang.Override
public com.microsoft.azure.PagedList<com.microsoft.azure.management.network.PublicIpAddress> listByGroup(java.lang.String groupName) throws com.microsoft.azure.CloudException, java.io.IOException {
    System.out.println("log");
    com.microsoft.rest.ServiceResponse<com.microsoft.azure.PagedList<com.microsoft.azure.management.network.implementation.api.PublicIPAddressInner>> response = client.list(groupName);
    return converter.convert(toPagedList(response.getBody()));
}
