public class _27Pattern {
    public static void main(String[] args) {
        for(int i=1;i<=11;i++)
        {
            for(int k=1;k<=i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=11;j++)
            {
                System.out.print("*");
            }
          
            System.out.println();
        }
    }
}
