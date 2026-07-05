import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class GCanYouSplitTheArray{
public static void main(String [] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));


 
StringTokenizer input= new StringTokenizer(br.readLine());
int n=Integer.parseInt(input.nextToken());
int m=Integer.parseInt(input.nextToken());
int []arr=new int[n];
 
StringTokenizer input2=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(input2.nextToken());
}

long l=0;
long h= 0;
for(int i=0;i<n;i++){
    l=Math.max(l, arr[i]);
    h+=arr[i];
}




long ans=h;


while(l<=h) {

    long mid=l+(h-l)/2;

   
long sum=0;
int count=1;
boolean flag=true;

    for (int i=0;i<n;i++) {

        if (sum+arr[i]<=mid){
            sum+=arr[i];
        } else {
            count++;
            sum = arr[i];
            if (count > m) {
                flag = false;
                break;
            }
        }

    }

    if(flag){
    ans=mid;
    h=mid-1;
    } else {
    l=mid+1;
    }
}

out.println(ans);
out.flush();







}
}