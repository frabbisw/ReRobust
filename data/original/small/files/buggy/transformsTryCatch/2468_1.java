@org.springframework.web.bind.annotation.RequestMapping(value = { "/about", "/Open/about" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String about(org.springframework.ui.Model model) {
    org.springframework.web.servlet.ModelAndView model1 = new org.springframework.web.servlet.ModelAndView();
    try {
        logger.debug("index()");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model1.setViewName("/Open/about");
    return "/Open/about";
}
