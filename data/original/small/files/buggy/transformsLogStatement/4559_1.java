@org.springframework.web.bind.annotation.RequestMapping(value = com.it.audit.web.constants.RequestURI.INDEX_CENTER_URI)
public org.springframework.web.servlet.ModelAndView centerContent(@org.springframework.web.bind.annotation.PathVariable com.it.audit.enums.UserRole role) {
    switch(role) {
        case ADMIN:
            return new org.springframework.web.servlet.ModelAndView("user/list", "role", role.name());
        default:
            break;
    }
    System.out.println("log");
    return buildDefaultErrorPage("请开通所需权限");
}
