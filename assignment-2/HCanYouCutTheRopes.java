import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class HCanYouCutTheRopes {
    public static void main(String []args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
 

StringTokenizer input= new StringTokenizer(br.readLine());
int n=Integer.parseInt(input.nextToken());
long m=Long.parseLong(input.nextToken());

int []arr=new int[n];
 
StringTokenizer input2=new StringTokenizer(br.readLine());
for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(input2.nextToken());
}
long all_sum=0;
for(int i=0;i<n;i++){
all_sum +=arr[i];
}

if(m>all_sum){
    out.println(-1);
}else{


long maxlen=0;
for(int i=0;i<n;i++){
    maxlen=Math.max(arr[i],maxlen);
}
long l=1;
long h=maxlen;
long ans=1;

while (l<=h) {
    long mid=l+(h-l)/2;
    

    long total=0;
    for (int i=0;i<n;i++) {
        total+=arr[i]/mid;
    }
    
    if(total>=m) {
        ans=mid;     
        l=mid+1;   
    }else{
        h=mid-1; 
    }
}

out.println(ans);




}


out.flush();
    }
}