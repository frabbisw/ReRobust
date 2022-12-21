@java.lang.Override
public java.lang.Object call() {
    System.out.println("log");
    return proxyService.waitForResponse(new com.smockin.admin.persistence.entity.RestfulMock(pk.getPath(), pk.getMethod(), com.smockin.admin.persistence.enums.RecordStatusEnum.ACTIVE, com.smockin.admin.persistence.enums.MockTypeEnum.PROXY, 3000));
}
