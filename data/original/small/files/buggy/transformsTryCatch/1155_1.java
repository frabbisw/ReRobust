@org.springframework.web.bind.annotation.GetMapping(value = "saveAsJson")
public java.lang.String saveAsJson(final javax.servlet.http.HttpServletResponse response, final org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    try {
        cookFileToDownload("json", response, redirectAttributes);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "redirect:allAddressess";
}
