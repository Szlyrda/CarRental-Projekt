import javax.annotation.processing.SupportedSourceVersion;
import java.io.Console;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int choose = 0;

        RentalCompany rentalCompany = new RentalCompany("JanuszRent", "Grunwaldzka 286, Gdańsk", "666 768 223");
        Scanner scanner = new Scanner(System.in);
        while (choose != 8) {

            System.out.println("--- Menu ---");
            System.out.println("1. Wypożyczenie samochodu");
            System.out.println("2. Zwrot samochodu");
            System.out.println("3. Lista dostępnych samochodów");
            System.out.println("4. Rezerwacja samochodu");
            System.out.println("5. Anulowanie rezerwacji");
            System.out.println("6. Wyjście");
            System.out.print("Wybierz opcję: ");
            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("Kto wypożycza samochód?");
                    System.out.println("1. Stały klient");
                    System.out.println("2. Nowy klient");
                    int customerOption = scanner.nextInt();
                    switch (customerOption) {
                        case 1:
                            System.out.println("Wybierz klienta do którego chcesz przypisać wypożyczenie:");
                            rentalCompany.getCustomers();
                            break;
                        case 2:
                            System.out.println("Aby dodać klienta podaj informacje o nim:");
                            System.out.print("Imie: ");
                            String name = scanner.nextLine();
                            System.out.print("Nazwisko: ");
                            String surname = scanner.nextLine();
                            System.out.print("Nr. tel: ");
                            String phone = scanner.nextLine();
                            System.out.print("E-mail: ");
                            String email = scanner.nextLine();
                            System.out.print("Adres: ");
                            String address = scanner.nextLine();

                            Customer customer = new Customer(name, surname, phone, email, address);
                            rentalCompany.addCustomer(customer);

                    }
                case 2:
                    // Kod do wykonania dla opcji 2 (zwrot samochodu)
                    break;
                case 3:
                    // Kod do wykonania dla opcji 3 (lista dostępnych samochodów)
                    break;
                case 4:
                    // Kod do wykonania dla opcji 4 (rezerwacja samochodu)
                    break;
                case 5:
                    // Kod do wykonania dla opcji 5 (anulowanie rezerwacji)
                    break;
                case 6:
                    // Kod do wykonania
                    break;

            }
        }
    }
}




