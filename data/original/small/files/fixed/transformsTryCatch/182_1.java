public void setOnItemClickListener(final com.loyalium.cpuloyal.tipcalc.models.TipRecord element, final com.loyalium.cpuloyal.tipcalc.adapters.OnItemClickListener listener) {
    try {
        itemView.setOnClickListener(new android.view.View.OnClickListener() {

            @java.lang.Override
            public void onClick(android.view.View view) {
                listener.onItemClick(element);
            }
        });
    } catch (Exception ex) {
        ex.printStackTrace();
    }
}
