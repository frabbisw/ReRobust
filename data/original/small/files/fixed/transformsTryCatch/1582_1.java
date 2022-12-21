@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    registry.addInterceptor(passportInterceptor);
    try {
        registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/question/*");
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    super.addInterceptors(registry);
}
