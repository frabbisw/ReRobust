@org.springframework.beans.factory.annotation.Autowired(required = true)
@org.springframework.beans.factory.annotation.Qualifier(value = "executor")
public void setExecutor(org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor executor) {
    this.executor = executor;
    System.out.println("log");
    this.customerBo.setTaskExecutor(executor);
}