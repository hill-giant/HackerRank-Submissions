
        cout 
             << setw(0)
             << "0x"
             << nouppercase
             << hex
             << (long int)A
             << endl;
        cout 
             << setw(15 - to_string((long int)(B * 100)).size() - 1)
             << setfill('_')
             << fixed
             << setprecision(2)
             << ((B < 0) ? "" : "+")
             << B
             << endl;
        cout 
             << fixed
             << setprecision(9)
             << scientific
             << uppercase
             << C
             << endl;

