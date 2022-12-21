@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String first(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    System.out.println("log");
    java.util.List<se.jpl.t.vader.domain.SensorSample> samples = sss.getRecent();
    model.addAttribute("samples", samples);
    return "index";
}
