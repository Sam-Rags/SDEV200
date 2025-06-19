public class ConditionalOperators {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        
        // Conditional operator for status is as follows:
        // if n1 > n2 return 1 : else if n1 == n2, return 0 :
        // else if n1 != n2, return -1        
        int status = n1 > n2 ? 1: (n1 == n2 ? 0: -1);
        int status2 = n1 < n2 ? 1: (n1 == n2 ? 0: -1);
        int status3 = n1 == n2 ? 1: (n1 < n2 ? 0: -1);

        System.out.println(status);
        System.out.println(status2);
        System.out.println(status3);
    }
    
}
