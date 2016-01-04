package app;

public class TennisJavaApp {

    public static void main(String[] args) {
        try {
            new Fenetre().setVisible(true);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}