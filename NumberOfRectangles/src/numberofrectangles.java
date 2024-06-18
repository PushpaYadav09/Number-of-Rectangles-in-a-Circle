import java.util.*;
public class numberofrectangles {
    public static void main(String[] args) {
        Scanner rc=new Scanner(System.in);
        int r=rc.nextInt();
        System.out.println("radius of circle= "+r);
        System.out.println("Number of rectangles that can be cut off from a circle= "+rectanglesInCircle(r));

    }
        static int rectanglesInCircle(int r) {
            int count =0;
            for(int i=1;i<=2*r+1;i++){
                for(int j=1;j<=2*r+1;j++)
                    if(i*i+j*j<=2*r*2*r){
                        count++;
                    }
            }

            return count;
        }
    }

