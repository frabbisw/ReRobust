@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(com.hlz.webModel.UserModel user) {
    try {
        if (service.login(user)) {
            return "redirect:/";
        } else {
            return "login";
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
