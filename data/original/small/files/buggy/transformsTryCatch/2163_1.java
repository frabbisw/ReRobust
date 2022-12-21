@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String first(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    java.util.List<se.jpl.t.vader.domain.SensorSample> samples = sss.getRecent();
    try {
        model.addAttribute("samples", samples);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "index";
}
