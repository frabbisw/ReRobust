@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public java.lang.String login(com.hlz.webModel.UserModel user) {
    System.out.println("log");
    if (service.login(user)) {
        return "redirect:/";
    } else {
        return "login";
    }
}
