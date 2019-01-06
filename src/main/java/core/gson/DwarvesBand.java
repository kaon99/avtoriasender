package core.gson;

import java.util.LinkedList;
import java.util.List;

public class DwarvesBand {
    List<Dwarf> dwarves = new LinkedList<Dwarf>();



    public void addDwarf (Dwarf dwarf){
        dwarves.add(dwarf);
    }

    public List<Dwarf> getDwarves() {
        return dwarves;
    }

    public void setDwarves(List<Dwarf> dwarves) {
        this.dwarves = dwarves;
    }

    @Override
    public String toString() {
        return "DwarvesBand{" +
                "dwarves=" + dwarves +
                '}';
    }
}
