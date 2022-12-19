import java.util.Scanner;

public class ATMSwitchCase {
    public static void main(String[] args) {
        int hak = 5, bakiye = 5000, secim, yatirilanTutar, cekilenTutar;
        String userName, password;
        Scanner input = new Scanner(System.in);

        while (hak > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("programci") && password.equals("java123")) {
                System.out.println("Hoş Geldiniz " + userName);
                do {
                    System.out.println("Yapmak İstediğiniz İşlemi Seçiniz : \n");
                    System.out.print("1- Para Çekme \n2- Para Yatırma \n3- Bakiye Sorgulama \n4- Çıkış ");
                    secim = input.nextInt();
                    switch (secim) {
                        case 1:
                            System.out.print("Çekmek İstediğiniz Tutar : ");
                            cekilenTutar = input.nextInt();
                            if (cekilenTutar < bakiye) {
                                System.out.println("İşleminiz Gerçekleşti");
                                bakiye -= cekilenTutar;
                                break;
                            } else {
                                System.out.println("Yetersiz Bakiye");
                                break;
                            }
                        case 2:
                            System.out.print("Yatırmak İstediğiniz Tutar : ");
                            yatirilanTutar = input.nextInt();
                            bakiye += yatirilanTutar;
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bakiye);
                            break;
                    }
                } while (secim != 4);
                System.out.print("Çıkış Yapılıyor...");
                break;
            } else {
                hak--;
                System.out.println("Hatalı Giriş Yaptınız ");
                if (hak == 0) {
                    System.out.println("5 Defa Hatalı Giriş Yaptınız Hesabınız Bloke Olmuştur ");
                    System.out.print("Müşteri Hizmetleriyle İletişime Geçiniz ");
                } else {
                    System.out.println("Kalan Hakkınız : " + hak);
                }
            }
        }
    }
}
