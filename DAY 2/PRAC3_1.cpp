#include<iostream>
#include<cstdlib>
using namespace std;

int linearSearch(int* arr,int key,int n);

int main(){
system("cls");
    int n,key;
    cout<<"Enter Size Of Array: ";
    cin>>n;
    cout<<"Enter Array: ";
    int arr[n];
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    cout<<"Enter Key: ";
    cin>>key;
    cout<<linearSearch(arr,key,n);
    return 0;
}

int linearSearch(int* arr,int key,int n){
    for(int i=0;i<n;i++){
        if(arr[i]==key){
            return i;
        }
    }
}