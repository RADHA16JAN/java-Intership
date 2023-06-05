public class question7 {
    public static void main(String[] args) {
int n=9,m=4;
// line
for(int i=0;i<n;i++){
    System.out.print("*"+" ");
}
        System.out.println(" ");

        // rectangle 6*4
for(int i=0;i< n;i++){
    for(int j=0;j<m;j++){
        if(i==0||i==n-1||j==0||j==m-1)
        System.out.print("*");
        else System.out.print(" ");
    }
    System.out.println(" ");
}

        System.out.println(" ");
//  Square 6*6
        for(int i=0;i< n;i++){
            for(int j=0;j<n;j++){
                if(i==0||i==n-1||j==0||j==n-1)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println(" ");
        }

        System.out.println(" ");


        // Triangle right angled
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(i==1||i==n||j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println(" ");

// Equilateral Triangle
        for(int i=0;i<=3;i++){
            for(int j=0;j<=6;j++){
                if((i+j==3)||(j-i==3)||(i==3&&j%2==0)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}
