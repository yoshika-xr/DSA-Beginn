import java.util.Arrays;
public class count{
    public static void main(String[] args){
        int[] arr={1,2,1,2,3,3,4};
        int[] c=new int[100];   
        for(int n:arr){
            c[n]++;
        }
        System.out.println(Arrays.toString(c));
    }
}