import java.util.ArrayList;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        ArrayList<Abiturient> AbitList = new ArrayList<>();
        int id, mark, size = 3, max;
        int rating[] = new int[size];
        String name, surname, thirdname, adress, phone;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; ; i++) {
            System.out.print("\nEnter abiturient`s ID: ");
            id = scanner.nextInt();
            if (id == 0) {
                break;
            }
            scanner.nextLine();
            System.out.print("Enter abiturient`s name: ");
            name = scanner.nextLine();
            System.out.print("Enter abiturient`s surname: ");
            surname = scanner.nextLine();
            System.out.print("Enter abiturient`s adress: ");
            adress = scanner.nextLine();
            System.out.print("Enter abiturient`s phone: ");
            phone = scanner.nextLine();
            System.out.print("Enter abiturient`s ZNO score: ");
            for (int j = 0; j < size; j++) {
                rating[j] = scanner.nextInt();
            }
            mark = avg(rating);
            Abiturient First = new Abiturient(id, name, surname, adress, phone, mark);
            AbitList.add(i, First);
        }
        for (Abiturient v : AbitList) {
            System.out.print(v);
        }
        scanner.nextLine();
        System.out.print("\nEnter name-: ");
        String findName = scanner.nextLine();
        System.out.print("\nResults-:");
        Abiturient.NeededName(AbitList, findName);
        System.out.print("\nEnter GPA-: ");
        int findMark = scanner.nextInt();
        System.out.print("\nResults-:");
        Abiturient.AboveAverage(AbitList, findMark);
        System.out.print("\nHow many N applicants do you want to withdraw?: ");
        int N = scanner.nextInt();

        max = Abiturient.Max(AbitList);
    }
    public static int avg(int[] rating) {
        int result = 0;
        for (int i : rating) {
            result += i;
        }
        return result / rating.length;
    }
}