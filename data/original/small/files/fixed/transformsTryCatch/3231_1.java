@org.springframework.web.bind.annotation.RequestMapping(value = "/reikningur/breyta-lykilordi", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String renderPasswordChange(javax.servlet.http.HttpSession session, org.springframework.ui.ModelMap model) {
    try {
        model.addAttribute("form_switch", "password");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.addAttribute("username", ((java.lang.String) (session.getAttribute("username"))));
    return "account";
}
