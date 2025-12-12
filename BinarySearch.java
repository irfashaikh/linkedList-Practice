

class demo {


    static int check (int[] arr , int n){
        int f= 0 ;
        int l = arr.length-1 ;

        while (f <= l){
            int m = f + (l-f)/2;

            if (arr[m]== n){
                return m ;
            }
            else if( arr[m] > n){
                l = m-1 ;
            }
            else{
                f = m + 1;
            }
        }
        return -1 ;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,15,26,37,48,99};
        int n = 1 ;

        int ans = check (arr , n);
        System.out.println(ans);
    }
}