public class TestMammal {
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.displayEnergy();
        Gorilla Gorilla= new Gorilla();
        Gorilla.displayEnergy();
        Gorilla.throwSomething();
        Gorilla.displayEnergy();
        Gorilla.eatBananas();
        Gorilla.displayEnergy();
        Gorilla.climb();
        Gorilla.displayEnergy();
        System.out.println("+++++++++++++++++++");
        Specimen Specimen = new Specimen();
        Specimen.fly();
        Specimen.displayEnergy();
        Specimen.eatHumans();
        Specimen.displayEnergy();
        Specimen.attackTown();
        Specimen.displayEnergy();
    }

}
