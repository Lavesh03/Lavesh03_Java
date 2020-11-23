//Program No.15 : Read and Display the number as command line arguments and display addition

public class Command {
    public static void main(String args[]) {
        int a=args.length;
        System.out.println("The arguments length is:"+a);
        for(int i=0;i<a;i++)
        {
            System.out.println("The "+i+" arguments is:"+args[i]);
        }
    }
}
