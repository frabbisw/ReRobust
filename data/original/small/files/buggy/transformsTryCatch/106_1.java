@org.springframework.web.bind.annotation.RequestMapping(value = "/update/commit")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String commitUpdate() {
    logger.info("GET: /update/commit");
    java.util.List<ua.org.ecity.entities.City> cities = updateDB();
    try {
        for (ua.org.ecity.entities.City city : cities) {
            cityService.saveCity(city);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "redirect: /manager";
}
