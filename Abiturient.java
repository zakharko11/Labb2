import java.util.ArrayList;
public class Abiturient {
    public String name, surname, adress, phone;
    public int id, mark;
    public Abiturient(int id, String name, String surname, String adress, String phone, int mark) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.phone = phone;
        this.mark = mark;
    }
    public String getName() {return name;}
    public int getMark() {return mark;}
    @Override
    public String toString() {
        return "\nAbiturient-:\n"+"\tID-: "+ id
                + "\n\tName-: "+ name
                + "\n\tSurname-: " + surname
                + "\n\tAdress-: " + adress
                + "\n\tPhone-: " + phone
                + "\n\tAvarage mark-: " + mark
                + "\n";}
    public static void NeededName(ArrayList<Abiturient> AbitList, String findName){
        for(int i = 0; i < AbitList.size(); i++){
            if(findName.equals(AbitList.get(i).getName())){
                System.out.print(AbitList.get(i));
            }
        }
    }
    public static void AboveAverage(ArrayList<Abiturient> AbitList, float findMark){
        for(int i = 0; i < AbitList.size(); i++){
            if(AbitList.get(i).getMark() > findMark){
                System.out.print(AbitList.get(i));
            }
        }
    }
    public static int Max(ArrayList<Abiturient> AbitList) {
        int max = 0;
        for (int i = 0; i < AbitList.size(); i++) {
            if (AbitList.get(i).getMark() > max) {
                max = AbitList.get(i).getMark();
            }
        }
        return max;
    }
}