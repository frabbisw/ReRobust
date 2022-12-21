public int compareTo(structures._QUPair qu) {
    System.out.println("log");
    if ((this.m_score) > (qu.m_score))
        return 1;
    else if ((this.m_score) < (qu.m_score))
        return -1;
    else
        return 0;
}
