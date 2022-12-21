@org.springframework.web.bind.annotation.RequestMapping(value = "/addnotice")
public java.lang.String addNotice(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, org.springframework.ui.ModelMap modelMap) throws java.io.UnsupportedEncodingException {
    java.lang.String content = request.getParameter("data");
    try {
        noticeService.add(content);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return "pages/template/notice";
}
