import java.io.*;

public class ATwoSumTrouble {
    public static void main(String []args) throws IOException{
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
 
String[] input = br.readLine().split(" ");

int n= Integer.parseInt(input[0]);
int target = Integer.parseInt(input[1]);
int []arr=new int[n];
String[] input_line_2 = br.readLine().split(" ");

for(int i=0;i<n;i++){
arr[i]=Integer.parseInt(input_line_2[i]);
}



int a=0;
int b=n-1;
boolean flag=false;
while(a<b){
    int sum=arr[a]+arr[b];
    if(sum<target){
        a++;
    }else if(sum>target){
b--;
    }else if(sum==target){
        System.out.println(a+1+" "+(b+1));
        flag=true;
        break;
    }
}

if(!flag){System.out.println(-1);}







    }
}
