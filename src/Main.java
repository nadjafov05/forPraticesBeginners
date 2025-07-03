public class Main {
    public static void main(String[] args) {

    }

    public static void tapsiriq13(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j == 1 || i == j || i == 5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void tapsiriq12(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (j == 1 || j == 5 || i == j){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void tapsiriq11(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i == j || i + j == 6){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
    public static void tapsiriq10(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5 -i;j++){
                System.out.print(" ");
            }
            for (int k =1; k<=2 * i -1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i=4;i>=1;i--){
            for (int j=1;j<=5 - i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2 * i - 1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq9(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){

                System.out.print(" ");
            }
            for (int k = 1;k<=2 * i - 1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq8(){
        for (int i=1;i<=5;i++){
            for (int j = 1; j <= i - 1; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= 6 - i; k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq7(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if (i == 1 || i == 5 || j == 1 || j == 5){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void tapsiriq6(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriqi5(){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5-i;j++){
                System.out.print(" ");
            }

            for (int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tapsiriq4(){
        for (int i=1;i<=5;i++){
            for (int j=5;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void tapsiriq3(){
        //Tapşırıq 3:
        //Artan ulduzlardan ibarət üçbucaq çap et:
        //   *
        //   **
        //   ***
        //   ****
        //   *****
        for (int i=1;i<=5;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void tapsiriq2() {

        //Tapşırıq 2:
        //Konsola 5 sətirdə, hər sətirdə 1 ədəd * çap et

        for (int i = 1; i <= 5; i++) {
            System.out.println("*");
        }
    }
    public static void tapsiriq1(){
        //Tapşırıq 1:
        //Konsolda bir sətrdə 5 ədəd * çap et:

        for (int i=1;i<=5;i++){
            System.out.print("*");
        }
    }
}