import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.math.BigInteger;



class CFastPowerDrift{
public static void main(String[]args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));

StringTokenizer input = new StringTokenizer(br.readLine());
long n=Long.parseLong(input.nextToken());
long m=Long.parseLong(input.nextToken());

BigInteger mod=BigInteger.valueOf(107);
BigInteger base=BigInteger.valueOf(n).mod(mod);
BigInteger result=BigInteger.ONE;


long exp=m;


while(exp > 0){
    if(exp % 2==1){
        result=result.multiply(base).mod(mod);
    }
    exp=exp/2;
    base=base.multiply(base).mod(mod);
}


out.println(result);
out.flush();

}





}