public class Main {
    public static void main(String[] args) {

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