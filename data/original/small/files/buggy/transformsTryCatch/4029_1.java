@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public org.springframework.web.servlet.ModelAndView index(org.springframework.ui.ModelMap model) {
    try {
        com.garethahealy.springboot.gameoflife.frontend.controllers.IndexController.LOG.info("index... hit!!!");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.addAttribute("message", "Game of Life");
    model.addAttribute("gof", boardService.print());
    return new org.springframework.web.servlet.ModelAndView("index");
}
