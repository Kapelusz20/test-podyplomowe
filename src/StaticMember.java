public class StaticMember {
    public static void main(String[] args) {

        FamillyMember dad = new FamillyMember();
        dad.name = "Piotr";
        dad.age = 32;

        FamillyMember mom = new FamillyMember();
        mom.name = "Anna";
        mom.age = 31;

        FamillyMember kid = new FamillyMember();
        kid.name = "Zosia";
        kid.age = 3;

        show(mom);
        show(dad);
        show(kid);
    }

    static void show (FamillyMember famillyMember){
        System.out.print(famillyMember.name);
        System.out.print(" ");
        System.out.print(famillyMember.surname);
        System.out.print(" ");
        System.out.print(famillyMember.age);
        System.out.println(" lat/a");
    }
}

class FamillyMember {
    static String surname = "Nowak";
    String name;
    int age;
}