@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView index(org.springframework.ui.ModelMap model) {
    try {
        model.addAttribute("message", "Game of Life");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.addAttribute("gof", boardService.print());
    return new org.springframework.web.servlet.ModelAndView("index");
}
