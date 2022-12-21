@org.junit.Test
public void getData() {
    java.util.List<com.cidic.sdx.model.BrandModel> list = brandServiceImpl.getBrandData("0");
    try {
        java.lang.System.out.println(list.size());
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
