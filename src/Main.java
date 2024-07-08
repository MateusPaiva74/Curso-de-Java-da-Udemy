public class Main {
    public static void main(String[] args) {

        Mamifero mamifero = new Mamifero();

        mamifero.setName("Gato");
        mamifero.setPeso(21.9);
        mamifero.setCorDoPelo("Branco");

        System.out.println(mamifero.getName());
        System.out.println(mamifero.getDono());
        System.out.println(mamifero.getPeso());
        System.out.println(mamifero.getCorDoPelo());
    }
}