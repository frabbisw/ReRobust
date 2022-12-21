public br.com.moip.resource.Invoice get(final java.lang.String id) {
    br.com.moip.resource.Invoice invoice = client.get((id + "/v2/invoices/"), br.com.moip.resource.Invoice.class);
    return invoice;
}
