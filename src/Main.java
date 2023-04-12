import java.util.Scanner;

class BankProgram {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("Silahkan pilih operasi: ");
            System.out.println("1. Cek saldo");
            System.out.println("2. Tarik tunai");
            System.out.println("3. Setor tunai");
            System.out.println("4. Keluar");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Saldo Anda saat ini adalah: " + balance);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah uang yang akan ditarik: ");
                    int withdrawAmount = input.nextInt();
                    if (withdrawAmount > balance) {
                        System.out.println("Maaf, saldo Anda tidak cukup!");
                        break;
                    }
                    balance -= withdrawAmount;
                    System.out.println("Anda telah berhasil menarik uang sebesar " + withdrawAmount);
                    break;
                case 3:
                    System.out.print("Masukkan jumlah uang yang akan disetor: ");
                    int depositAmount = input.nextInt();
                    balance += depositAmount;
                    System.out.println("Anda telah berhasil melakukan setoran sebesar " + depositAmount);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        }
    }
}
