import java.util.Scanner;

public class SayilarToplami {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int toplam = 0 ,cifSayi =0, dordunKati=0,total=0;
        boolean devam =true;

        while (devam){

            System.out.print("bir sayı giriniz:");
            int sayi= input.nextInt();

            if (sayi % 2 == 0 ) {
                cifSayi++;
                total+=sayi ;

            }  if (sayi % 4 == 0) {
                dordunKati++;
                sayi+=total;
            }

            if (sayi % 2 == 1){
                devam = false;
            }
        }

        System.out.println(" Girilen çiftsayılar toplamı(adet)  :"+cifSayi +"\n" + "4'ün katı olan sayıların toplamı (adet): "+dordunKati+"\n"+"Girilen çift ve 4'ün katı olan sayıların toplamı : "+total);
    }
}