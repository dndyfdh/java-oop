public class array {
  public static void main(String[] args) {
    // deklarasi
    String[] cars = {"Volvo", "Mercedez"};
    Number[] myNumbers = new Number[4];
    myNumbers[0] = 10;
    myNumbers[1] = 20;
    myNumbers[2] = 30;
    myNumbers[3] = 40;

    // akses elemen array
    System.out.println(cars[0]);
    System.out.println(myNumbers[1]);

    // manipulasi sistem array
    myNumbers[1] = 100;
    myNumbers[2] = null;

    System.out.println(myNumbers[1]);
    System.out.println(myNumbers[2]);
    
  }
}
