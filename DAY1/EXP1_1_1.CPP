#include<iostream>
using namespace std;
bool ans(int arr[],int n,int k);
int main(){
    int k=0,n;
    cout<<"Enter K: ";
    cin>>k;
    cout<<"Enter Array Size: ";
    cin>>n;
    int arr[n];
    cout<<"Enter Array: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    if(ans(arr,n,k)){
        cout<<"Yes,It Is Good Pair!!";
    }else{
        cout<<"No,It Is Not Good Pair!!";
    }

    return 0;
}

bool ans(int* arr,int size,int k){
    
    if(size%2!=0){
        return false;
    }
    int count=0;
    int key[size]={0};
    for(int i=0;i<size;i++){
        for(int j=i+1;j<size;j++){
            if((arr[i]+arr[j])%k==0 && key[i]==0 && key[j]==0){
                count++;
                key[i]=-1;
                key[j]=-1;
            }
        }
    }
    if(count==(size/2)){
        return true;
    }else {
        return false;
    }
}
