@java.lang.Override
public void postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory) throws org.springframework.beans.BeansException {
    try {
        beanFactory.getBeanDefinition("").getPropertyValues();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
