import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();
        System.out.format("The Player has %d slots with weapons," + " enter number to shoot," +
                " -1 to exit%n", player.getSlotsCount());
        int slot;

        while (true) {
            slot = scanner.nextInt();
            if (slot == -1) break;
            player.shootWithWeapon(slot);
        }

        System.out.println("Game over!");
    }
}
