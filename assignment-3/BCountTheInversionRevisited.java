import java.io.*;
import java.util.StringTokenizer;

public class BCountTheInversionRevisited{
static long count = 0;
public static void main(String []args) throws IOException{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
PrintWriter out=new PrintWriter(new BufferedOutputStream(System.out));
int n=Integer.parseInt(br.readLine());

int arr[]=new int[n];
StringTokenizer input = new StringTokenizer(br.readLine());
for(int i=0;i<n;i++){
    arr[i]=Integer.parseInt(input.nextToken());
}

margeSort(arr, 0, arr.length - 1);

out.println(count);

out.flush();
}


public static void marge(int []arr,int l,int m,int r){

int n1=m-l+1; 
int n2=r-m;
int []left_half=new int[n1];
int []right_half=new int[n2];

for (int i=0;i<n1;i++) {
        left_half[i] = arr[l+i];
}

for (int j=0;j<n2;++j) {
        right_half[j]=arr[m+1+j];
}

for(int j=0;j<n2;j++){
    long threshold=(long)right_half[j]*(long)right_half[j];
    int idx=upperBound(left_half,threshold);
    count += (n1-idx);
}

int i = 0; 
int j = 0; 
int k = l;

while(i<n1 && j<n2){
if (left_half[i] <= right_half[j]) {
        arr[k] = left_half[i];
        i++;
} else {
    arr[k] = right_half[j];
     j++;
}
        k++;
}

while(i<n1) {
        arr[k]=left_half[i];
        i++;
    k++;
}

while (j<n2) {
        arr[k]=right_half[j];
    j++;
        k++;
}

}


public static int upperBound(int []arr, long t){
int l=0;
int h=arr.length;
while(l<h){
    int mid=l+(h-l)/2;
    if ((long)arr[mid]<=t) {
        l=mid+1;
    } else {
        h=mid;
    }
}
return l;
}


public static void margeSort(int[] arr, int l, int r) {
if (l<r) {

int m=l+(r-l)/2;

        margeSort(arr,l,m);
        margeSort(arr,m + 1,r);

        marge(arr,l,m,r);
}
}

}