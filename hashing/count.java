import java.util.Arrays;
public class count{
    public static void main(String[] args){
        int[] arr={1,2,1,2,3,3,3,4};
        int[] co=new int[100];   
        for(int n:arr){
            co[arr[n]]++;
        }
        System.out.println(Arrays.toString(co));
    }
}