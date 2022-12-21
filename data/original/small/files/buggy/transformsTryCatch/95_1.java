@java.lang.Override
public boolean addRouteModel(casak.ru.geofencer.domain.model.Route model) {
    casak.ru.geofencer.domain.model.Route result = casak.ru.geofencer.storage.converters.RouteConverter.convertToStorageModel(model);
    try {
        result.insert();
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return true;
}
