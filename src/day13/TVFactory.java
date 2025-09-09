package day13;

public class TVFactory {

    public static TV getTV(String tvName) {
        if (tvName.equalsIgnoreCase("s")) {
            return new STV();
        } else if (tvName.equalsIgnoreCase("l")) {
            return new LTV();
        } else {
            return null;
        }
    }
}
