public br.com.moip.resource.Invoice get(final java.lang.String id) {
    System.out.println("log");
    br.com.moip.resource.Invoice invoice = client.get(("/v2/invoices/" + id), br.com.moip.resource.Invoice.class);
    return invoice;
}
