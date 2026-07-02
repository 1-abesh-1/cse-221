import java.io.*;
import java.util.StringTokenizer;

public class CABeautifulSortedList {
    public static void main(String []args) throws IOException{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

 int n=Integer.parseInt(br.readLine());
StringTokenizer input = new StringTokenizer(br.readLine());
int []arr=new int[n];
for(int i=0;i<n;i++){
    arr[i]=Integer.parseInt(input.nextToken());
}

int m=Integer.parseInt(br.readLine());
StringTokenizer input2 = new StringTokenizer(br.readLine());
int []arr2=new int[m];
for(int i=0;i<m;i++){
    arr2[i]=Integer.parseInt(input2.nextToken());
}

int arr3[] =new int[n+m];

int a=0;
int b=0;
int c=0;

while(c<m+n) {

  if (a<n && (b>= m||arr[a]<=arr2[b])) {
                arr3[c]=arr[a];
                a++;
            } else {
                arr3[c]=arr2[b];
                b++;
            }

    c++;
}






for(int i=0;i<n+m;i++){
    out.print(arr3[i]+" ");
}










out.flush();

    }
}
