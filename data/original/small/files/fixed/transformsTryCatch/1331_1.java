@org.junit.Test
public void createResource() {
    eu.h2020.symbiotelibraries.cloud.model.CloudResource resource = getTestResource();
    java.util.List<eu.h2020.symbiotelibraries.cloud.model.CloudResource> resources = new java.util.ArrayList<eu.h2020.symbiotelibraries.cloud.model.CloudResource>();
    try {
        resources.add(resource);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
