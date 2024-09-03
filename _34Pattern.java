public class _34Pattern {
    public static void main(String[] args) {
        int a=-1;
        int b=1;
    for(int i=1;i<=4;i++)
    {
        
        for(int j=1;j<=i;j++)
        {
            int c=a+b;
            System.out.print(" "+c);
            a=b;
          b=c;
            
        }
    
        System.out.println("");
    }
    }
}
