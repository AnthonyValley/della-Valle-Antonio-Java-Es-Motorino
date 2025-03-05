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

    public void accelera(double incremento) {
        if (!antifurto) {
            velocita += incremento;
        }
    }

    public void inserisciAntifurto() {
        antifurto = true;
    }

    public static void main(String[] args) {

        Motorino mioMotorino = new Motorino("Rosso", "Piaggio Scarabeo", 50.0);

        System.out.println("Velocità iniziale: " + mioMotorino.getVelocita() + " km/h");

        mioMotorino.accelera(10.0);
        System.out.println("Velocità dopo accelerazione: " + mioMotorino.getVelocita() + " km/h");

        mioMotorino.inserisciAntifurto();

        mioMotorino.accelera(20.0);
        System.out.println("Velocità dopo tentata accelerazione con antifurto: " + mioMotorino.getVelocita() + " km/h");
    }
}