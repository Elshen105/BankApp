import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // first User
        System.out.print("Enter firstUserName : ");
        String firstUserName = new Scanner(System.in).nextLine();

        System.out.print("Enter firstUserSurname : ");
        String firstUserSurname = new Scanner(System.in).nextLine();
        System.out.print("Enter firstUserAge : ");
        byte firstUserAge = scanner.nextByte();

        System.out.print("Enter firstUserMoney : ");
        double firstUserMoney = scanner.nextDouble();


        // Second User
        System.out.print("Enter secondUserName : ");
        String secondUserName = new Scanner(System.in).nextLine();

        System.out.print("Enter secondUserSurname : ");
        String secondUserSurname = new Scanner(System.in).nextLine();
        System.out.print("Enter secondUserAge : ");
        byte secondUserAge = scanner.nextByte();

        System.out.print("Enter secondUserMoney : ");
        double secondUserMoney = scanner.nextDouble();



        while (true) {
            System.out.println("***************************************************************");
            System.out.println("First operation : " + firstUserName + " To " + secondUserName);
            System.out.println("Second operation : " + secondUserName + " To " + firstUserName);
            System.out.println("thirty operation : " + "exit");
            System.out.println("***************************************************************");

            System.out.print("Hansi emeliyati etmek isteyirsiniz : ");
            int operation = scanner.nextInt();
            System.out.println();
            switch (operation) {
                case 1:
                    System.out.println("------------------------------------------------------");
                    System.out.println("Curent " + firstUserName + " : " + firstUserMoney);
                    System.out.println("Curent " + secondUserName + " : " + secondUserMoney);
                    System.out.println("------------------------------------------------------");
                    System.out.println();
                    if (firstUserMoney > 0) {
                        System.out.print("Ne qeder pul gondermek isteyirsiniz : ");
                        double money = scanner.nextDouble();

                        if (money > 0 && money <= firstUserMoney) {

                            firstUserMoney -= money;
                            secondUserMoney += money;
                        } else {
                            System.err.println("Kifayet qeder vesaitiniz yoxdur");
                        }
                        System.out.println();
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println(firstUserName + " : " + firstUserMoney);
                        System.out.println(secondUserName + " : " + secondUserMoney);
                        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++");
                        System.out.println();
                    } else {
                        System.out.println(firstUserName  + " Kifayet qeder vesaitiniz yoxdur");
                    }

                    break;

                case 2:
                    System.out.println("------------------------------------------------------");
                    System.out.println("Curent " + secondUserName + " : " + secondUserMoney);
                    System.out.println("Curent " + firstUserName + " : " + firstUserMoney);
                    System.out.println("------------------------------------------------------");
                    System.out.println();
                    if (firstUserMoney > 0) {
                        System.out.print("Ne qeder pul gondermek isteyirsiniz : ");
                        double money = scanner.nextDouble();

                        if (money > 0 && money <= secondUserMoney) {

                            secondUserMoney -= money;
                            firstUserMoney += money;
                        } else {
                            System.out.println();
                            System.err.println("Kifayet qeder vesaitiniz yoxdur");
                        }
                        System.out.println(secondUserName + " : " + secondUserMoney);
                        System.out.println(firstUserName + " : " + firstUserMoney);
                    } else {
                        System.out.println();
                        System.err.println(secondUserName + " Kifayet qeder vesaitiniz yoxdur");
                    }

                    break;
                case 3:
                    System.out.println("The program will exit...");
                    System.exit(0);

            }
        }

    }

}

