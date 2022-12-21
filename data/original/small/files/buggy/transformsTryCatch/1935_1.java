@org.springframework.web.bind.annotation.RequestMapping(value = "/order/{orderId}")
public java.lang.String orderDetail(@org.springframework.web.bind.annotation.PathVariable java.lang.Long orderId, org.springframework.ui.ModelMap model) {
    java.lang.System.out.println("here in order detail");
    try {
        model.addAttribute("order", this.orderService.getOrder(orderId));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "orderDetail";
}
