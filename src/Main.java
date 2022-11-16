import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int option;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName=inp.nextLine();

        System.out.print("Şifreniz: ");
        password=inp.nextLine();

        if (userName.equals("patika") && password.equals("java123"))
        {
            System.out.println("Giriş Yaptınız!");
        } else if (!password.equals("java123")) {
            System.out.println("Şifrenizi sıfırlamak İster misiniz?\n1-Evet\n2-Hayır");
            option = inp.nextInt();
            switch (option) {
                case 1:
                    Scanner inp3 = new Scanner(System.in);
                    System.out.println("Yeni şifrenizi giriniz!\nYeni Şifreniz: ");
                    newPassword=inp3.nextLine();
                    if (newPassword.equals("java123")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    }
                    else {
                        System.out.println("Şifre Oluşturuldu.");
                    }
                    break;
                default:
                    System.out.println("Bilgileriniz yanlış, tekrar deneyiniz.");
                    break;
        }
        }
        else {
            System.out.println("Giriş Yapılamadı.");
        }
    }
}