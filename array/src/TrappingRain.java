public class TrappingRain {
    public static void main(String[] args) {
        int[]arr={0,1,0,2,1,0,1,3,2,1,2,1};
        int l=0,r=arr.length-1;
        int lmax=0,rmax=0;
        int water=0;
        while(l<r){
            lmax=Math.max(lmax,arr[l]);
            rmax=Math.max(rmax,arr[r]);
            if(lmax<=rmax){
                water+=lmax-arr[l];
                l++;
            }else{
                water+=rmax-arr[r];
                r--;
            }
        }
        System.out.println(water);
    }
}
