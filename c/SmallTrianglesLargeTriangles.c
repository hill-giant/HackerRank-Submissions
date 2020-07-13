

double p(const triangle* t) {
    return (t->a + t->b + t->c)*0.5;
}

int compare(const void* a, const void* b) {
   const triangle* t1 = a;
   const triangle* t2 = b;
   const double p1 = (t1->a + t1->b + t1->c)*0.5;
   const double p2 = (t2->a + t2->b + t2->c)*0.5;
   const double v1 = sqrt(p1*(p1-t1->a)*(p1-t1->b)*(p1-t1->c));
   const double v2 = sqrt(p2*(p2-t2->a)*(p2-t2->b)*(p2-t2->c));
   return (v1 > v2) - (v1 < v2);
}

void sort_by_area(triangle* tr, int n) {
    qsort(tr, n, sizeof(triangle), compare);
}


