import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class H220TreesReassessed{
    static int preIndex = 0;
static int postIndex = 0;
public static void main(String[]args) throws IOException{
     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out= new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));


 int m = Integer.parseInt(br.readLine().trim());
int inorder[]=new int[m];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            inorder[i]=Integer.parseInt(st.nextToken());
        }
int postorder[]=new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            postorder[i]=Integer.parseInt(st2.nextToken());
        }


int preorder[]=new int[m];

postIndex=m-1;
preIndex=m-1;

build(inorder, postorder, 0, m - 1, preorder);

for(int i=0;i<m;i++){
    out.print(preorder[i]+" ");
}


out.flush();


 
}


public static void build(int[] inorder, int[] postorder,
                         int l, int r,
                         int[] preorder) {

    if (l > r){
        return;
    }
    int root=postorder[postIndex--];

    int p= l;
    while(inorder[p] != root){
        p++;
    }
    build(inorder,postorder,p+1, r, preorder);
    build(inorder,postorder,l,p-1, preorder);

    preorder[preIndex--]=root;
}
}