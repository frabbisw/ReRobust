@org.springframework.web.bind.annotation.RequestMapping(value = "/tbox/update", method = { org.springframework.web.bind.annotation.RequestMethod.POST })
@org.springframework.web.bind.annotation.ResponseBody
public void tboxUpdate(java.lang.Integer id, java.lang.String name, java.lang.String data, int delay) {
    try {
        tboxService.updateTboxById(id, name, data, delay);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
