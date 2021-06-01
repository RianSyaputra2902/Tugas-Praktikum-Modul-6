package TumpukanApp;
public class TumpukanApp {
        public static void main(String[] args) {
    Tumpukan.title();
    Tumpukan tumpukan = new Tumpukan(10);
    tumpukan.push(50);
    tumpukan.baca();
    tumpukan.push(100);
    tumpukan.baca();
    long nilai1=tumpukan.pop();
    System.out.println("nilai Pertama yang dihilangkan = "+nilai1);
    System.out.println("\n");
    tumpukan.baca();
    tumpukan.push(60);
    tumpukan.baca();
    tumpukan.push(80);
    tumpukan.baca();
    long nilai2=tumpukan.pop();
    System.out.println("nilai kedua yang dihilangkan = "+nilai2);
    System.out.println("\n");
    tumpukan.baca();
    long DataTop = tumpukan.peek();
    System.out.println("Data Paling Atas = "+DataTop);
    System.out.println(" ");    
    }
}
