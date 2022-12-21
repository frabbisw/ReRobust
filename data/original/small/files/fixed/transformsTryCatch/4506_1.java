@com.sample.web.admin.controller.html.system.codes.GetMapping(value = "/find")
public java.lang.String findCode(@com.sample.web.admin.controller.html.system.codes.ModelAttribute(value = "searchCodeForm") com.sample.web.admin.controller.html.system.codes.SearchCodeForm form, org.springframework.ui.Model model) {
    lombok.val where = modelMapper.map(form, com.sample.domain.dto.system.Code.class);
    lombok.val pages = codeService.findAll(where, form);
    try {
        model.addAttribute("pages", pages);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "modules/system/codes/find";
}
