public class ArrayElementsPrint {
    public static void main(String[] args) {
        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i =0; i < arr.length; i++){
            if(arr[i] % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
