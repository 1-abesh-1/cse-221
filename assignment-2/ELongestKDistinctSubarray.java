import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ELongestKDistinctSubarray{
public static void main(String []args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
String[] input = br.readLine().split(" ");
int n= Integer.parseInt(input[0]);
 
int m= Integer.parseInt(input[1]);

StringTokenizer input2 = new StringTokenizer(br.readLine());
int []arr=new int[n];

for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(input2.nextToken());
}

int a=0;
int maxLen=0;
int distinct=0;
int f[]=new int[n+1];
for(int b=0;b<n;b++){
   int val=arr[b];
    if(f[val] == 0){
            distinct++;
        }
        f[val]++;

           while(distinct > m){
            int l = arr[a];
            f[l]--;
            if(f[l] == 0){
                distinct--;
            }
            a++;
        }
maxLen=Math.max(maxLen, b - a + 1);


   
    


}






 System.out.println(maxLen);



}
}