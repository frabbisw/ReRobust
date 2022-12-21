public int getPointCaptures(com.deci.tfstatsrev.TF2Stats.Datatype dt) {
    if (dt == ACCUM) {
        return accum.PointCaptures;
    } else if (dt == MAX) {
        return max.PointCaptures;
    } else if (dt == MVMACCUM) {
        return -1;
    } else if (dt == MVMMAX) {
        return -1;
    } else {
        return -1;
    }
}
