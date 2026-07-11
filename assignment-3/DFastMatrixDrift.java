
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DFastMatrixDrift{
public static void main(String [] args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));

int t=Integer.parseInt(br.readLine());



long mod=1000000007;





while(t-->0){
long arr[]=new long[4];
StringTokenizer input=new StringTokenizer(br.readLine());
for(int i=0;i<4;i++){
    arr[i]=Integer.parseInt(input.nextToken());
}

long m=Long.parseLong(br.readLine());



arr=matrix_power(arr,mod,m);









out.println(arr[0]+" "+arr[1]);
out.println(arr[2]+" "+arr[3]);

}
out.flush();


}

public static long [] matrix_multiply(long[] a,long[] b,long mod){
    long []r=new long[4];
    r[0]=(a[0]*b[0]+a[1]*b[2])%mod;
    r[1]=(a[0]*b[1]+a[1]*b[3])%mod;
    r[2]=(a[2]*b[0]+a[3]*b[2])%mod;
    r[3]=(a[2]*b[1]+a[3]*b[3])%mod;
    return r;
}


public static long [] matrix_power(long[] arr,long mod,long m){
    if(m==0){
        return new long[]{1,0,0,1};
    }

    long []half=matrix_power(arr,mod,m/2);
    long []a=matrix_multiply(half,half,mod);

    if((m&1)==1){
        a=matrix_multiply(a,arr,mod);
    }

    return a;
}




}