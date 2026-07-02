import java.io.*;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class DLongestSubarraySum{
public static void main(String []args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
 
String [] input=br.readLine().split(" ");
 int n=Integer.parseInt(input[0]);
  int m=Integer.parseInt(input[1]);
StringTokenizer input2 = new StringTokenizer(br.readLine());
int []arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=Integer.parseInt(input2.nextToken());
}

int a=0;
int sum=0;
int biggest=0;

for (int b = 0; b < n; b++) {
            sum += arr[b]; 
           
            while(sum>m && a<=b) {
         sum-=arr[a];
                a++;
            }

            
    int current=b-a+1;
            if (current>biggest) {
                biggest=current;
            }
        }

  out.print(biggest);

out.flush();
}

}