public org.json.JSONObject getObject () { try { return ( responseText ) == null ? null : new org.json.JSONObject ( responseText ) ; } catch ( org.json.JSONException ex ) { return null ; } } 
