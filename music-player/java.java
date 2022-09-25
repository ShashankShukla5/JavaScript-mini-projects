import java.util.*;

public class Experiment5 {

    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        ArrayList<String> property_loc = new ArrayList<String>();
        property_loc.add("Delhi");
        property_loc.add("Faridabad");
        property_loc.add("Rithala");
        property_loc.add("Shahbad");
        ArrayList<String> property_rate = new ArrayList<String>();
        property_rate.add("2.1Cr");
        property_rate.add("1.2Cr");
        property_rate.add("3Cr");
        property_rate.add("7.25Cr");
        System.out.println("Initital data base:");
        for (int i = 0; i < property_loc.size(); i++) {
            System.out.print("Loctaion:");
            System.out.println(property_loc.get(i));
            System.out.print("Rates:");
            System.out.println(property_rate.get(i));
            System.out.println();
        }
        do {
            menu();
            n = sc.nextInt();
            if (n == 1)
                modify(property_loc, property_rate);
            else if (n == 2)
                delete(property_loc, property_rate);
            else if (n == 3)
                get(property_loc, property_rate);
            else if (n == 4)
                display(property_loc, property_rate);
            // else
            // modify();
        } while (true);

    }

    private static void menu() {

        System.out.println("Array List Menu");
        System.out.println("1. Modify Record");
        System.out.println("2. Delete Record");
        System.out.println("3. Get record");
        System.out.println("4. Display");
        System.out.println("5. Exit");
        System.out.print("Enter the choice:");

    }

    static void get(ArrayList<String> property_loc, ArrayList<String> property_rate) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter the property location:");
        n = sc.nextLine();
        for (int i = 0; i < property_loc.size(); i++) {
            if (property_loc.get(i).equals(n)) {

                System.out.println("Loctaion:" + property_loc.get(i));
                System.out.print("Rates:" + property_rate.get(i));
            }
        }
        sc.close();

    }

    static void delete(ArrayList<String> property_loc,
            ArrayList<String> property_rate) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.print("Enter the property location:");
        n = sc.nextLine();
        for (int i = 0; i < property_loc.size(); i++) {
            if (property_loc.get(i).equals(n)) {
                property_loc.remove(i);
                property_rate.remove(i);
                System.out.println("Reord Updated !!");
            }
        }
        sc.close();
    }

    static void display(ArrayList<String> property_loc, ArrayList<String> property_rate) {
        for (int i = 0; i < property_loc.size(); i++) {
            System.out.print("Loctaion:");
            System.out.println(property_loc.get(i));
            System.out.print("Rates:");
            System.out.println(property_rate.get(i));
            System.out.println();
        }
    }

    static void modify(ArrayList<String> property_loc, ArrayList<String> property_rate) {
        Scanner sc = new Scanner(System.in);
        String n, newrate, newloc;
        System.out.print("Enter the property location:");
        n = sc.nextLine();
        for (int i = 0; i < property_loc.size(); i++) {
            if (property_loc.get(i).equals(n)) {
                System.out.print("Enter the new loc");
                newloc = sc.nextLine();
                property_loc.set(i, newloc);
                System.out.print("Enter the new rate");
                newrate = sc.nextLine();
                property_rate.set(i, newrate);
                System.out.println("Updated!!!");
            }
        }
        sc.close();
    }
}
