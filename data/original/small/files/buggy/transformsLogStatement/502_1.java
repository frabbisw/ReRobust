@java.lang.Override
public void postProcessBeanFactory(org.springframework.beans.factory.config.ConfigurableListableBeanFactory beanFactory) throws org.springframework.beans.BeansException {
    System.out.println("log");
    beanFactory.getBeanDefinition("").getPropertyValues();
}