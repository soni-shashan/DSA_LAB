#include<iostream>
#include<cstdlib>
#include <string>
#include <algorithm> 
using namespace std;

string getLengthOfMaxString(string);
int main(){
    system("cls");
    string text;
    cout<<"Enter String To Find Maximum Length Of Word: ";
    getline(cin,text);
    cout<<getLengthOfMaxString(text);
    return 0;
}

string getLengthOfMaxString(string s){
    int len[s.length()]={0};
    // string word[s.length()];
    int in[s.length()]={0};
    int t=0,l=0;
    for(int i=0;i<s.length();i++){
        if(s[i]==' '||i==s.length()-1){
            len[l]=t;
            // word[l]=s.substr(i-t,i);
            in[l]=i-t;
            l++;
            t=0;
        }else{
            t++;
        }
    }
    int max=len[0];
    int x=0;
    for(int i=1;i<=l;i++){
        if(max<len[i]){
            max=len[i];
            x=i;
        }
    }
    string ans=s.substr(in[x],in[x]+len[x]);
    ans=ans.substr(0,ans.find(' '));
    return ans;
}