@org.junit.Test
public void toBeanNUll() {
    com.feilong.tools.jsonlib.JsonUtilToBeanTest.LOGGER.info(com.feilong.tools.jsonlib.JsonUtil.toJSON(null).toString(4, 4));
    try {
        com.feilong.tools.jsonlib.JsonUtilToBeanTest.LOGGER.info(new net.sf.json.JSONObject().toString(4));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
