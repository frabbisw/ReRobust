@org.junit.Test
public void findOrders() {
    io.oasp.module.jpa.common.api.to.PaginatedListTo<io.oasp.gastronomy.restaurant.salesmanagement.logic.api.to.OrderCto> orders = this.helper.getService().findOrders(new io.oasp.gastronomy.restaurant.salesmanagement.service.impl.rest.MyUriInfo(null, null));
    assertThat(orders).isNotNull();
    System.out.println("log");
    assertThat(orders).isNotNull();
}
