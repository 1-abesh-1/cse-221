import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class FCountTheNumbers{
public static void main(String []args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
String[] input = br.readLine().split(" ");
int n= Integer.parseInt(input[0]);
 
int m= Integer.parseInt(input[1]);
 

StringTokenizer input2 = new StringTokenizer(br.readLine());
int []arr=new int[n];
 
for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(input2.nextToken());
}



while(m-->0){

StringTokenizer input1 = new StringTokenizer(br.readLine());
int a=Integer.parseInt(input1.nextToken());
int b=Integer.parseInt(input1.nextToken());


int o=lower(arr, a) ;
int p=upper(arr, b);




out.println(p-o);


}











out.println();







 
out.flush();
}


public static int lower(int[] arr,int key) {
        int low=0,high=arr.length;
        while(low<high) {
            int mid=low+(high-low)/2;
            if(arr[mid]>=key) {
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
    
    
    public static int upper(int[] arr,int key) {
        int low=0,high=arr.length;
        while(low<high){
            int mid=low+(high-low)/2;
            if(arr[mid]<=key) {
                low=mid+1;
            }else{
                high=mid;
            }
        }
        return low;
    }



}