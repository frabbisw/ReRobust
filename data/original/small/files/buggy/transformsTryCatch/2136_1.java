protected com.eswaraj.web.dto.DepartmentDto createDepartment(java.lang.String categoryName, java.lang.String description, java.lang.Long categoryId) {
    com.eswaraj.web.dto.DepartmentDto departmentDto = new com.eswaraj.web.dto.DepartmentDto();
    try {
        departmentDto.setName(categoryName);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    departmentDto.setDescription(description);
    departmentDto.setCategoryId(categoryId);
    return departmentDto;
}
