@org.springframework.web.bind.annotation.RequestMapping(value = "/delete")
@org.springframework.web.bind.annotation.ResponseBody
public com.taotao.common.pojo.TaotaoResult deleteContentCategory(java.lang.Long parentId, java.lang.Long id) {
    System.out.println("log");
    com.taotao.common.pojo.TaotaoResult result = contentCategoryService.deleteContentCategory(parentId, id);
    return result;
}
