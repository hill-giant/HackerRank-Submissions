
struct document get_document(char* text) {
    struct document d;
    d.data = NULL;
    char* rest = text;
    char* pToken;
    char* sToken;
    char* wToken;
    while (pToken = strtok_r(rest, "\n", &rest)) {
        struct paragraph p;
        p.data = NULL;
        while (sToken = strtok_r(pToken, ".", &pToken)) {
            struct sentence s;
            s.data = NULL;
            while (wToken = strtok_r(sToken, " ", &sToken)) {
                struct word w;
                w.data = wToken;
                s.word_count++;
                s.data = realloc(s.data,
                                 sizeof(struct word) * s.word_count);
                s.data[s.word_count - 1] = w;
            }
            p.sentence_count++;
            p.data = realloc(p.data,
                             sizeof(struct sentence) * p.sentence_count);
            p.data[p.sentence_count - 1] = s;
        }
        d.paragraph_count++;
        d.data = realloc(d.data,
                         sizeof(struct paragraph) * d.paragraph_count);
        d.data[d.paragraph_count - 1] = p;
    }
    return d;
}

struct word kth_word_in_mth_sentence_of_nth_paragraph(struct document Doc, int k, int m, int n) {
    return Doc.data[n-1].data[m-1].data[k-1];
}

struct sentence kth_sentence_in_mth_paragraph(struct document Doc, int k, int m) { 
    return Doc.data[m-1].data[k-1];
}

struct paragraph kth_paragraph(struct document Doc, int k) {
    return Doc.data[k-1];
}


