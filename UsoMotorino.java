public class UsoMotorino {
    public static void main(String[] args) {
        Motorino m1 = new Motorino("Grigio metallizzato", "Piaggio Liberty", 40.5);
        System.out.println("Velocità iniziale motorino 1: " + m1.getVelocita());

        MotorinoImmatricolato m2 = new MotorinoImmatricolato("Rosso", "Aprilia Scarabeo", 30.5, 60, "CV1234");
        System.out.println("Velocità massima: " + m2.getMaxVelocita());
        System.out.println("Targa motorino 2: " + m2.getTarga());

        m1.accelera(30.7);
        m2.accelera(30.7);

        System.out.println("Nuova velocità motorino 1: " + m1.getVelocita());
        System.out.println("Nuova velocità motorino 2: " + m2.getVelocita());
    }
}
