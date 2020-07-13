#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
	int ia, ib;
    scanf("%d %d", &ia, &ib);
    int isum = ia + ib;
    int idiff = ia - ib;
    float fa, fb;
    scanf("%f %f", &fa, &fb);
    float fsum = fa + fb;
    float fdiff = fa - fb;
    printf("%d %d\n%0.1f %0.1f", isum, idiff, fsum, fdiff);
    return 0;
}
