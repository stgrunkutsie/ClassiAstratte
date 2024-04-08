public class ClasseAstratta {
    public static void main(String[] args)
    {
        Cat gatto = new Cat();
        gatto.Rumoreggia();
        Dog cane = new Dog();
        cane.Rumoreggia();
        Pig porco = new Pig();
        porco.Rumoreggia();
        PanzerVITigerI panzer = new PanzerVITigerI();
        panzer.Rumoreggia();
    }
}