@org.springframework.web.bind.annotation.RequestMapping(value = "/reikningur/breyta-lykilordi", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String renderPasswordChange(javax.servlet.http.HttpSession session, org.springframework.ui.ModelMap model) {
    model.addAttribute("form_switch", "password");
    System.out.println("log");
    model.addAttribute("username", ((java.lang.String) (session.getAttribute("loggedInUsername"))));
    return "account";
}
