@java.lang.Override
public void remove(int position) {
    try {
        indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRemoved(position);
    } catch (Exception ex) {
        ex.printStackTrace();
    }
    contentList.remove(position);
    indi.yume.tools.adapter_renderer.recycler.RendererAdapter.notifyItemRangeChanged(0, getItemCount());
}
