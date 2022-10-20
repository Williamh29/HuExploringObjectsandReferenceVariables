public class Main {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Lovebird", "Bill", 5);
        Parrot parrot2 = parrot1;
        parrot2.setAge(10);



        Parrot parrot3 = new Parrot("Cockatoo", "Lisa", 12);
        parrot2 = parrot3;
        parrot3 = parrot1;
        parrot3.setName("Jeff");
        parrot1 = parrot2;
        System.out.println(parrot1.getName());
        System.out.println(parrot2.getName());
        System.out.println(parrot3.getName());
        System.out.println(parrot1 == parrot2);
        System.out.println(parrot1 == parrot3);
        System.out.println(parrot2 == parrot3);
        System.out.println(parrot1.info());
        parrot1 = null;
        System.out.println(parrot1.info());
        Rectangle rectA = new Rectangle(80, 100);
        Rectangle rectB = new Rectangle(80, 100);
        System.out.println(rectA == rectB);
        System.out.println(rectA);
        System.out.println(rectB);




    }
}