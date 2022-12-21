@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.PUT, value = "/menu/{id}")
public void updatePizza(@org.springframework.web.bind.annotation.RequestBody com.tramppizza.domains.Pizza pizza, @org.springframework.web.bind.annotation.PathVariable java.lang.String id) {
    try {
        menuService.updatePizza(id, pizza);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
