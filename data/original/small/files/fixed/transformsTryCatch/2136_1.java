protected com.eswaraj.web.dto.DepartmentDto createDepartment(java.lang.String categoryName, java.lang.String description, java.lang.Long categoryId) {
    com.eswaraj.web.dto.DepartmentDto departmentDto = new com.eswaraj.web.dto.DepartmentDto();
    departmentDto.setName(categoryName);
    try {
        departmentDto.setDescription(description);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return departmentDto;
}
