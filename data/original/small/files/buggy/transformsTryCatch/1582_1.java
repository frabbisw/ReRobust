@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    try {
        registry.addInterceptor(passportInterceptor);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/question/*");
    registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/");
    super.addInterceptors(registry);
}
