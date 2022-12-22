import java.util.Scanner;

 class bot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tsau. Mu nimi on Daniel.");
        System.out.println("Ja see on minu õpipäevik.");
        System.out.println("Mis on riigi nimi, kus hetkel elad?");

        String name = scanner.nextLine();

        System.out.println("Oo, " + name + " on väga lahe!");
        System.out.println("Nüüd mängime mingit kahtlast mängu.");
        System.out.println("Jaga oma vanus kolme numbriga ja lisa vastuseks jäägid, kui oled vanuse jaganud 3, 5 and 7-ga.");

        int remainder3 = scanner.nextInt();
        int remainder5 = scanner.nextInt();
        int remainder7 = scanner.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;

        System.out.println("Su vanus on " + age + ": juhul, kui said ülesandest õigesti aru!");
        System.out.println("Kirjuta suvaline number siia ja ma loetlen need ükshaaval üles.");

        int countTo = scanner.nextInt();

        for (int i = 0; i <= countTo; i++) {
            System.out.println(i + "!");
        }

        while (true) {
            System.out.println("Mis on USA pealinn?");
            System.out.println("1. New York City");
            System.out.println("2. Chicago");
            System.out.println("3. Washington D.C.");
            System.out.println("4. Los Angeles"Ee);

            int answer = scanner.nextInt();

            if (answer == 3) {
                break;
            }

            System.out.println("Oled nuub.");
        }

        System.out.println("Oled väga lahe!");
    }
}