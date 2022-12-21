@org.tekCorp.api.control.RequestMapping(value = "/add", method = RequestMethod.POST)
@org.tekCorp.api.control.ResponseBody
public org.tekCorp.api.domain.Type add(@org.tekCorp.api.control.RequestBody org.tekCorp.api.domain.Type type) {
    org.tekCorp.api.domain.Type oriType = typeRepository.findByName(type.getName());
    if (oriType != null) {
        return oriType;
    }
    try {
        type = typeRepository.save(type);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return type;
}
