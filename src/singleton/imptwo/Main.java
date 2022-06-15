package singleton.imptwo;

import javax.xml.crypto.Data;

public class Main {

    public static void main(String[] args) {
        Database db1 = Database.getInstance();

        Database db2 = Database.getInstance();

        RandomClass randomClass = new RandomClass();

//        Database database = new Database();

//        Database database = Database.instance;
//        Database.instance = null;
    }
}
