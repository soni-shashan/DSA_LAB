#include<iostream>
#include<cstdlib>
using namespace std;

int getLengthOfMaxString(string);
int main(){
    system("cls");
    string text;
    cout<<"Enter String To Find Maximum Length Of Word: ";
    getline(cin,text);
    cout<<getLengthOfMaxString(text);
    return 0;
}

int getLengthOfMaxString(string s){
    int len[s.length()]={0};
    string word[s.length()]="";
    int t=0,l=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '||i==s.length()-1){
            len[l]=t;
            word[l]=s.substr(i-t,i)
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