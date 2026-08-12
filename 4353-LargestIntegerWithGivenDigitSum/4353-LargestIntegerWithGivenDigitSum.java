// Last updated: 12/08/2026, 11:44:16
class Solution{
    public int largestInteger(int n, int s){
        if(s==0)
            return 0;
        if(s>9*n)
            return -1;
        String ans = "";
        for(int i=0;i<n;i++){
            if(s>=9){
                ans += "9";
                s -= 9;
            }else{
                ans += s;
                s = 0;
            }
        }
        return Integer.parseInt(ans);
    }
}