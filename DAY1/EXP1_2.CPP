#include<iostream>
#include<vector>
using namespace std;
void ans(vector<int>&,int);
int main(){
    int k=0,n;
    cout<<"Enter K: ";
    cin>>k;
    cout<<"Enter Array Size: ";
    cin>>n;
    vector<int> arr(n,0);
    cout<<"Enter Array: ";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }
    ans(arr,k);
    return 0;
}

void ans(vector<int>& arr,int k){
    int count=0;
    vector<int> key(arr.size(),1);
    if(arr.size()!=0)
    for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            if((arr[i]+arr[j])%k==0 && key[i]==1 && key[j]==1){
                count++;
                key[i]=0;
                key[j]=0;
                printf("(%d,%d)\n",arr[i],arr[j]);
            }
        }
    }
}
