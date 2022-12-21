@java.lang.Override
public void setParameters(org.wso2.carbon.gateway.core.config.ParameterHolder parameterHolder) {
    try {
        logMessage = parameterHolder.getParameter("parameters").getValue();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
