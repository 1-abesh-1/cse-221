import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class FOrderingBinaryTree{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
 
        int m = Integer.parseInt(br.readLine().trim());
int arr[]=new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(st.nextToken());
        }

recursion(arr, 0, m);

out.flush();
    }



public static void recursion(int arr[],int n, int m){
 if (n >= m) return;
    int l=n+(m-n-1)/2;

System.out.print(arr[l]+" ");
recursion(arr,n,l);
recursion(arr, l+1, m);

}




}