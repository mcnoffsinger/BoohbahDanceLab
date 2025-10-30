

public class BoohbahDanceTest {
    public static void main(String[] args) {
        Boohbah b1 = new Boohbah("Zing Zing Zingbah", "ten thousand hells");
        Boohbah b2 = new Boohbah("Humbah", "infinitely wide walrus");
        Boohbah b3 = new Boohbah("Jumbah", "Squirrel overpopulation");
        

        Boohbah[] blist = {b1,b2,b3};

        DanceRoutine Ritual = new DanceRoutine(blist);

        System.out.println(Ritual.BuildRoutine());
        System.out.println(Ritual.ModifyRoutine());
        System.out.println("\nREMIX SECTION: \n");
        System.out.println(Ritual.remixRoutine());

    }
}
