@java.lang.Override
public void extendHandlerExceptionResolvers(java.util.List<org.springframework.web.servlet.HandlerExceptionResolver> exceptionResolvers) {
    System.out.println("log");
    for (org.springframework.web.servlet.config.annotation.WebMvcConfigurer delegate : this.delegates) {
        delegate.configureHandlerExceptionResolvers(exceptionResolvers);
    }
}
