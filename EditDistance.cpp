#include<bits/stdc++.h>
using namespace std;
int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    int t;
    cin>>t;
    while(t--){
        int n,m,i;
        string str1,str2;
        cin>>n>>m;
        cin>>str1>>str2;
        sort(str1.begin(),str1.end());
        sort(str2.begin(),str2.end());
        int cnt=0;
        if(n>m){
            for(i=0;i<m;i++){
                if(str1[i]!=str2[i]){
                    cnt++;
                }
            }
            cnt+=(n-m);
        }
        else{
            for(i=0;i<n;i++){
                if(str1[i]!=str2[i]){
                    cnt++;
                }
            }
            cnt+=(m-n);
        }
        cout<<cnt<<"\n";
    }
    return 0;
}
