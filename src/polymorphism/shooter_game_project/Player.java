import weapon.*;

class Player {
    private final Weapon[] weaponSlots;

    public Player() {
        weaponSlots = new Weapon[] {
                new Automatic(),
                new Gun(),
                new RPG(),
                new Slingshot(),
                new WaterGun(),
        };
    }

    public int getSlotsCount() {
        return weaponSlots.length;
    }

    public void shootWithWeapon(int slot) {
        if (slot > getSlotsCount() - 1) {
            System.out.println("You should enter number from 0 to " + (getSlotsCount() - 1) + "!");
            return;
        }

        Weapon weapon = weaponSlots[slot];
        weapon.shot();
    }
}
