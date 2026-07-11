import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class G220Trees{
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
int preorder[]=new int[m];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            preorder[i]=Integer.parseInt(st2.nextToken());
        }

int postorder[]=new int[m];
int root=preorder[0];
postorder[m-1]=root;


int p=-1;
for(int i = 0;i<m;i++) {
    if(inorder[i]==root) {
        p=i;
        break;
    }
}

preIndex=0;
postIndex=0;

build(preorder,inorder,0,m-1,postorder);

for (int i=0;i<m;i++){
    out.print(postorder[i]+" ");
}


out.flush();


 
}


public static void build(int[] preorder, int[] inorder,
                         int l, int r,
                         int[] postorder) {

    if (l>r){
        return;
    }
    int root = preorder[preIndex++];

    int pos =l;
    while (inorder[pos] != root){
        pos++;
    }
    build(preorder, inorder,l,pos - 1,postorder);
    build(preorder,inorder,pos + 1,r, postorder);

    postorder[postIndex++] = root;
}
}