private org.apache.lucene.search.spans.SpanQuery fixField(org.apache.lucene.search.spans.SpanQuery query) {
    try {
        if (query.getField().equals(field.getStandard())) {
            return query;
        }
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    return new org.apache.lucene.search.spans.FieldMaskingSpanQuery(query, field.getStandard());
}
