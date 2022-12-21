@org.springframework.web.bind.annotation.RequestMapping(value = { "/about", "/Open/about" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public org.springframework.web.servlet.ModelAndView about(org.springframework.ui.Model model) {
    org.springframework.web.servlet.ModelAndView model1 = new org.springframework.web.servlet.ModelAndView();
    logger.debug("index()");
    try {
        model1.setViewName("/Open/about");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return model1;
}
