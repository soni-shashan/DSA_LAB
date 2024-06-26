#include<iostream>
#include<vector>
using namespace std;
bool ans(vector<int>&,int);
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
    if(ans(arr,k)){
        cout<<"Yes,It Is Good Pair!!";
    }else{
        cout<<"No,It Is Not Good Pair!!";
    }

    return 0;
}

bool ans(vector<int>& arr,int k){
    if(arr.size()%2!=0){
        return false;
    }
    int count=0;
    vector<int> key(arr.size(),1);
    for(int i=0;i<arr.size();i++){
        for(int j=i+1;j<arr.size();j++){
            if((arr[i]+arr[j])%k==0 && key[i]==1 && key[j]==1){
                count++;
                key[i]=0;
                key[j]=0;
            }
        }
    }
    if(count==(arr.size()/2)){
        return true;
    }else {
        return false;
    }
}
