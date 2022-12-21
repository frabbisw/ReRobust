@org.springframework.web.bind.annotation.GetMapping(value = "saveAsJson")
public java.lang.String saveAsJson(final javax.servlet.http.HttpServletResponse response, final org.springframework.web.servlet.mvc.support.RedirectAttributes redirectAttributes) {
    cookFileToDownload("json", response, redirectAttributes);
    System.out.println("log");
    return "redirect:allAddressess";
}
