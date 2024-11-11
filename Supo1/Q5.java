
public class Q5 {

    public static int[] vectorAdd(int x,int y,int dx, int dy) {
        x=x+dx;
        y=y+dy;
        int[] result = {x,y};
        return result;
    }

    public static void main(String[] args) {
        int a=0;
        int b=2;
        int[] result = vectorAdd(a,b,1,1);
        a = result[0];
        b = result[1];
        System.out.println(a+","+b);
    }

}

