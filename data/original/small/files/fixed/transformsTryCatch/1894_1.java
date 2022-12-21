@MPS.controllers.RequestMapping(value = "/view")
@MPS.controllers.ResponseBody
public java.util.List<MPS.models.Enterprises> list() {
    java.util.List enterprises = enterpriserepo.findAll();
    try {
        java.lang.System.out.println(enterprises.get(0));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return enterprises;
}
