#include <iostream>
using namespace std;

#include <cmath>
int main() {
int area;
cin>>area;
int minPeremiter  =INT32_MAX;
 //get all the factor of the number
    for (int i = 1; i <=area; ++i) {
        if(area%i==0)
            minPeremiter = min(minPeremiter,(2*i)+(2*(area/i)));
    }
    cout<<minPeremiter<<endl;
    return 0;
}