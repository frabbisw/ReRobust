private static <T> void matchProperty(biweekly.property.ValuedProperty<T> component, T propertyValue) {
    org.hamcrest.MatcherAssert.assertThat(component, org.hamcrest.core.IsNull.notNullValue());
    try {
        org.hamcrest.MatcherAssert.assertThat(component.getValue(), org.hamcrest.core.IsEqual.equalTo(propertyValue));
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
