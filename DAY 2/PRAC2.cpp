#include<iostream>
#include<cstdlib>
using namespace std;

int getLengthOfMaxString(string);
int main(){
    system("cls");
    string text;
    cout<<"Enter String To Find Maximum Length Of Word: ";
    cin>>text;
    cout<<getLengthOfMaxString(text);
    return 0;
}

int getLengthOfMaxString(string s){
    int len[s.length()]={0};
    int t=0,l=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '){
            len[l]=t;
            l++;
            t=0;
        }else if(i==s.length()-1){
            t++;
            len[l]=t;
            l++;
            t=0;
        }else{
            t++;
        }
    }
    int max=len[0];
    for(int i=1;i<=l;i++){
        if(max<len[i]){
            max=len[i];
        }
    }
    return max;
}