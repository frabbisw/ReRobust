@org.springframework.web.bind.annotation.RequestMapping(value = "/lectures", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getClasses(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    if (canCreate(request))
        model.addAttribute("canCreate", true);
    try {
        model.addAttribute("lecture", new it.unical.classmanager.model.data.Lecture());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return getLectures(model);
}
