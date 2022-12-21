@java.lang.Override
public void extendHandlerExceptionResolvers(java.util.List<org.springframework.web.servlet.HandlerExceptionResolver> exceptionResolvers) {
    try {
        for (org.springframework.web.servlet.config.annotation.WebMvcConfigurer delegate : this.delegates) {
            delegate.extendHandlerExceptionResolvers(exceptionResolvers);
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
