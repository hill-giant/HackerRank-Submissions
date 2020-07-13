

/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    return {
        length: a,
        width: b,
        area: a*b,
        perimeter: 2*(a+b)
    };
}




/*
 * Complete the Rectangle function
 */
function Rectangle(a, b) {
    this.length = a;
    this.width = b;
    this.area = this.length*this.width;
    this.perimeter = 2*(this.length + this.width);
}


