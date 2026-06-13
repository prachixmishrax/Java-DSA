public class hashtable {
    public static void main(String[] args) {
        int [] arr={2,2,2,3,6,4,7};
        int []hash=new int[10];
        int x,largest = arr[0];
        for(int i=0;i<arr.length;i++){
             x=arr[i];
              hash[x]++;
        }
        for (int i = 0; i < hash.length; i++) {
            System.out.print(hash[i]);
            if(hash[i]>largest)
                largest=hash[i];

        }


        System.out.println();
        System.out.println(largest);
        for (int i = 0; i < hash.length; i++) {
            if(hash[i]==largest)
                System.out.println(i);
        }

    }
}
