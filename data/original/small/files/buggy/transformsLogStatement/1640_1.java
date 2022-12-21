public com.foxinmy.weixin4j.http.weixin.ApiResult createKfAccount(java.lang.String id, java.lang.String name, java.lang.String pwd) throws com.foxinmy.weixin4j.exception.WeixinException {
    System.out.println("log");
    return customApi.createKfAccount(id, name, pwd);
}
