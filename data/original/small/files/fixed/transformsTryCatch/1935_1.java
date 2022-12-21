@org.springframework.web.bind.annotation.RequestMapping(value = "/order/{orderId}")
public java.lang.String orderDetail(@org.springframework.web.bind.annotation.PathVariable java.lang.Long orderId, org.springframework.ui.ModelMap model) {
    try {
        model.addAttribute("order", this.orderService.getOrder(orderId));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "orderDetail";
}
