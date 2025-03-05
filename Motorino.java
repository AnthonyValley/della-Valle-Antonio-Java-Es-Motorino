public class Motorino {
    private String colore;
    private double velocita;
    private String tipo;
    private boolean antifurto;

    public Motorino(String colore, String tipo, double velocita) {
        this.colore = colore;
        this.tipo = tipo;
        this.velocita = velocita;
        this.antifurto = false;
    }

    public double getVelocita() {
        return velocita;
    }

    protected void setVelocita(double nuovaVelocita) {  // Cambiato da public a protected
        this.velocita = nuovaVelocita;
    }

    public void accelera(double incremento) {
        if (!antifurto) {
            velocita += incremento;
        } else {
            System.out.println("Impossibile accelerare: antifurto attivo!");
        }
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    public boolean isAntifurtoAttivo() {
        return antifurto;
    }
}
