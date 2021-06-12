package com.sda.javaadvenceexercises.ex7;

public class Main {
    public static void main(String[] args) {

        WeaponMagazine weaponMagazine = new WeaponMagazine(5);
        weaponMagazine.loadBullet("Bullet 1");
        weaponMagazine.loadBullet("Bullet 2");
        weaponMagazine.loadBullet("Bullet 3");
        weaponMagazine.loadBullet("Bullet 4");
        weaponMagazine.loadBullet("Bullet 5");
        weaponMagazine.loadBullet("Bullet 6");

        for(int i = 0; i < 8; i++){
            weaponMagazine.shot();
        }

    }

}
