//      void print(){
//         // int[] arr = new arr(5);
//         Scanner sc = new Scanner(System.in);
//         for (int i = 0; i < 5; i++) {

            
//         }
//      }
// }
public class lab1_q5 {
    public static void main(String[] args) {
     
        System.out.printf("%-10s %-10s %-10s%n", "Number", "Square", "Cube");
        System.out.println("---------------------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%-10d %-10d %-10d%n", i, i * i, i * i * i);
        }
    }
}
