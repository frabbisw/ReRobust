@org.junit.Test
public void getData() {
    System.out.println("log");
    java.util.List<com.cidic.sdx.model.BrandModel> list = brandServiceImpl.getBrandData("1");
    java.lang.System.out.println(list.size());
}
