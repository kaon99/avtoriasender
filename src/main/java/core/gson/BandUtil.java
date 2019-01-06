package core.gson;

import java.util.LinkedList;
import java.util.List;

public class BandUtil {

    public static DwarvesBand createBand(){

        List<Weapon> weaponList1 = new LinkedList<Weapon>();
        weaponList1.add(new Weapon("Queen","Sword"));
        weaponList1.add(new Weapon("SerAdam","Axe"));
        weaponList1.add(new Weapon("Lanos","Knife"));


        DwarvesBand company = new DwarvesBand();

        Dwarf dwarf1 = new Dwarf();

        dwarf1.setName("John");
        dwarf1.setAge(90);
        dwarf1.setBeard("red");
        dwarf1.setWeapons(weaponList1);

        Dwarf dwarf2 = new Dwarf();
        dwarf2.setName("Tom");
        dwarf2.setAge(30);
        dwarf2.setBeard("black");
        dwarf2.setWeapons(weaponList1);

        company.addDwarf(dwarf1);
        company.addDwarf(dwarf2);


return company;
    }



}
