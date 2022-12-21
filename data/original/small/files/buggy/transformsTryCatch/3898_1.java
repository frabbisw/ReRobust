@org.smart4j.framework.mvc.annotation.Request.Post(value = "/chart/json")
public org.smart4j.framework.mvc.bean.Result getChartInfo(org.smart4j.framework.mvc.bean.Params params) {
    java.lang.Object[][] chartObjs = orderService.getChartInfo(params.getFieldMap());
    org.smart4j.framework.mvc.bean.Result result = new org.smart4j.framework.mvc.bean.Result(true);
    try {
        result.setData(chartObjs);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return result;
}
