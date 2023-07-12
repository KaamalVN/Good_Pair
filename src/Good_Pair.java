import java.util.Scanner;

public class Good_Pair {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size= scanner.nextInt();
        int[] array = new int[size];
        for(int iterator=0;iterator<size;iterator++){
            array[iterator]=scanner.nextInt();
        }
        int b= scanner.nextInt();
        System.out.println(pair_counter(array,b));

    }

    static int pair_counter(int[] array,int b) {
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i]+array[j]==b){
                    return 1;
                }
            }
        }
        return 0;
    }
}
