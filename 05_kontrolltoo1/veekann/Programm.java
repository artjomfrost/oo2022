public class Programm {
    public static void main(String[] args) {
        Veekann vk1 = new Veekann();
        vk1.veekannToole(10, 20.0);
        System.out.println(vk1.temperatuur());
        vk1.veeLisamine(500, 0);
        System.out.println(vk1.temperatuur());
        vk1.veekannToole(20, vk1.temperature);

        System.out.println("Veekeedukanni temperatuur: " + vk1.temperatuur());
    }
}