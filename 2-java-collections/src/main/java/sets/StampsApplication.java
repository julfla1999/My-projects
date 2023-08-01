package sets;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Warsaw", "4x5", true));
        stamps.add(new Stamp("London", "6x6", false));
        stamps.add(new Stamp("Cagliari", "5x5", true));
        stamps.add(new Stamp("Warsaw", "4x5", true));

        System.out.println(stamps.size());
        for ( Stamp stamp : stamps )
            System.out.println(stamp);
    }
}
