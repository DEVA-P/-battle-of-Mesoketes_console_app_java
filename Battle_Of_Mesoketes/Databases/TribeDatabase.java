package Battle_Of_Mesoketes.Databases;

import java.util.*;

import Battle_Of_Mesoketes.Models.Tribe;

public class TribeDatabase {
    private static HashMap<String, Tribe> TribeDb = new HashMap<String, Tribe>();

    // singleton instances

    // private static TribeDatabase instances = null;
    // public static TribeDatabase getInstance() {
    // if(instances == null)
    // return instances = new TribeDatabase();
    // else return instances;
    // }
    public static Tribe getTribeDb(String TribeIdentity) {
        return TribeDb.get(TribeIdentity);
    }

    public void addTribe(String TribeIdentity, Tribe newTribe) {
        TribeDb.put(TribeIdentity, newTribe);
    }

    public static boolean existsTribe(String TribeName) {
        return TribeDb.containsKey(TribeName);
    }
}
