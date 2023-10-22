package dz4;

public class Program {
    public static void main(String[] args) {
        Pair pair = new Pair<Integer, String>(5, "af");
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.toString());
    }
}
