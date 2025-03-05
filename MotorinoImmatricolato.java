public class MotorinoImmatricolato extends Motorino {
    private double maxVelocita;
    private String targa;

    public MotorinoImmatricolato(String colore, String tipo, double velocita, double maxVelocita, String targa) {
        super(colore, tipo, velocita);
        this.maxVelocita = maxVelocita;
        this.targa = targa;
    }

    public double getMaxVelocita() {  // Modificato per restituire il valore invece di stamparlo
        return maxVelocita;
    }

    public String getTarga() {
        return targa;
    }

    @Override
    public void accelera(double incremento) {
        if (!isAntifurtoAttivo()) {
            double nuovaVelocita = getVelocita() + incremento;
            if (nuovaVelocita > maxVelocita) {
                nuovaVelocita = maxVelocita;
            }
            setVelocita(nuovaVelocita);
        } else {
            System.out.println("Impossibile accelerare: antifurto attivo!");
        }
    }
}
