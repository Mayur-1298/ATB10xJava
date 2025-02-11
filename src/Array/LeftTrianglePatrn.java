package Array;

public class LeftTrianglePatrn {
    public static void main(String[] args) {
        int n=5;int m=n;
        for(int i=0;i<n;i++){

            for(int j=0; j<m; j++){
                System.out.print("*");

            }
            m--;
            System.out.println("");
        }
    }
}
