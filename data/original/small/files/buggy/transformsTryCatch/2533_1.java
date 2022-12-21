@org.springframework.web.bind.annotation.RequestMapping(value = "/login", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String adminLogin() throws java.lang.Exception {
    try {
        java.lang.System.out.println("어드민 로긘 포모옴 ");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "admin/loginform";
}
