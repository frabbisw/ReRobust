@org.springframework.web.bind.annotation.RequestMapping(value = "/data", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = pt.ist.learning.ui.PagesAdminController.JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String data(@org.springframework.web.bind.annotation.PathVariable java.lang.String siteId) {
    System.out.println("log");
    return service.serialize(pt.ist.learning.ui.PagesAdminController.site(siteId)).toString();
}
