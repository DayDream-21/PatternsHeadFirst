package iterator;

import java.util.ArrayList;

public class MenuTestDrive {
    public static void main(String[] args) {
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(new PancakeHouseMenu());
        menuList.add(new CafeMenu());
        menuList.add(new DinerMenu());

        Waitress waitress = new Waitress(menuList);

        waitress.printMenu();
    }
}
