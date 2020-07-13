
//Implement the class Box
//l,b,h are integers representing the dimensions of the box

// The class should have the following functions :

// Constructors:
// Box();
// Box(int,int,int);
// Box(Box);


// int getLength(); // Return box's length
// int getBreadth (); // Return box's breadth
// int getHeight ();  //Return box's height
// long long CalculateVolume(); // Return the volume of the box

//Overload operator < as specified
//bool operator<(Box& b)

//Overload operator << as specified
//ostream& operator<<(ostream& out, Box& B)

class Box {
    private:
        int l,b,h;
    public:
        Box();
        Box(int l, int b, int h);
        Box(const Box& box);
        int getLength(void);
        int getBreadth(void);
        int getHeight(void);
        long long CalculateVolume(void);
        friend bool operator < (const Box& boxA, const Box& boxB);
        friend ostream& operator << (ostream& os, const Box& b);
};

Box::Box(void) {
    l = 0;
    b = 0;
    h = 0;
}

Box::Box(int l, int b, int h) {
    this->l = l;
    this->b = b;
    this->h = h;
}

Box::Box(const Box& box) {
    l = box.l;
    b = box.b;
    h = box.h;
}

int Box::getLength(void) {
    return l;
}

int Box::getBreadth(void) {
    return b;
}

int Box::getHeight(void) {
    return h;
}

long long Box::CalculateVolume() {
    return (long long) l*b*h;
}

bool operator < (const Box& boxA, const Box& boxB) {
    return boxA.l < boxB.l
            || boxA.b < boxB.b && boxA.l == boxB.l
            || boxA.h < boxB.h && boxA.b == boxB.b && boxA.l == boxB.l;
}

ostream& operator << (ostream& os, const Box& b) {
    os << b.l << " " << b.b << " " << b.h;
    return os;
}

