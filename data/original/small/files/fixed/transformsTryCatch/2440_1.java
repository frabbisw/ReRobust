@java.lang.Override
public void postHandle(javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse httpServletResponse, java.lang.Object o, org.springframework.web.servlet.ModelAndView modelAndView) throws java.lang.Exception {
    try {
        java.lang.System.out.println(httpServletResponse);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
