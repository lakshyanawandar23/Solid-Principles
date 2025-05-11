package AdapatorPattern;

public class Adapator implements  MobileChargerInterface{
    private static Oldcharger oldcharger;

    public Adapator(Oldcharger oldcharger) {
        this.oldcharger = oldcharger;
    }
    @Override
    public void charge() {
        oldcharger.oldcharge();
    }
}
