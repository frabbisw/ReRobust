@org.springframework.web.bind.annotation.RequestMapping(value = "/lectures", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getClasses(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    try {
        if (canCreate(request))
            model.addAttribute("canCreate", true);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    model.addAttribute("lecture", new it.unical.classmanager.model.data.Lecture());
    return getLectures(model, request);
}
