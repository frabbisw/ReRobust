@java.lang.Override
public void addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    System.out.println("log");
    registry.addInterceptor(passportInterceptor);
    registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/question/*");
    registry.addInterceptor(loginRequiredInterceptor).addPathPatterns("/");
    super.addInterceptors(registry);
}
