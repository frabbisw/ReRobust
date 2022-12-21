@org.springframework.web.bind.annotation.RequestMapping(value = "/{cartId}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getCart(@org.springframework.web.bind.annotation.PathVariable(value = "cartId") java.lang.String cartId, org.springframework.ui.Model model) {
    try {
        model.addAttribute("cartId", cartId);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "cart";
}
