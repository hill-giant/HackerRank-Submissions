

char* kth_word_in_mth_sentence_of_nth_paragraph(char**** document, int k, int m, int n) {
    return document[n-1][m-1][k-1];
}

char** kth_sentence_in_mth_paragraph(char**** document, int k, int m) {
    return document[m-1][k-1];
}

char*** kth_paragraph(char**** document, int k) {
    return document[k-1];
}

char**** get_document(char* text) {
    char**** document;
    char*** paragraph;
    char**  sentence;
    char*   pToken;
    char*   sToken;
    char*   wToken;
    char*   rest = text;
    int p = 0;
    int s = 0;
    int w = 0;
    while(pToken = strtok_r(rest, "\n", &rest)) {
        paragraph = NULL;
        while (sToken = strtok_r(pToken, ".", &pToken)) {
            sentence = NULL;
            while (wToken = strtok_r(sToken, " ", &sToken)) {
                sentence = (char**)realloc(sentence, (w+1)*sizeof(char*));
                sentence[w] = wToken;
                w++;
            }
            paragraph = (char***)realloc(paragraph, (s+1)*sizeof(char**));
            paragraph[s] = malloc(w*sizeof(char*));
            while (--w >= 0)
                paragraph[s][w] = sentence[w];
            free(sentence);
            s++;
            w = 0;
        }
        document = (char****)realloc(document, (p+1)*sizeof(char***));
        document[p] = malloc(s * sizeof(char**));
        while(--s >= 0)
            document[p][s] = paragraph[s];
        free(paragraph);
        p++;
        s = 0;
    }
    return document;
}


