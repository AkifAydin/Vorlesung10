public class Exceptions {
    public static String clip(String s) throws Exception {
        if (s == null) {
            throw new Exception("keine gültige Zeichenkette");
// s ist null
        } else if (s.length() < 2) {
            throw new Exception("Zeichenkette muss mindestens Länge 2 haben.");
// s ist zu kurz
        } else return s.substring(1, s.length() - 1);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("String ohne Erstes und Letztes Zeichen");
        System.out.println(clip("hallo"));

        try {  //Methode testen ob Exception ausgegeben wird oder nicht
            String s = "O";
            clip(s);
            System.out.println(s);
        } catch (ExceptionInInitializerError e){
            System.out.println(e); //Error von der Methode
            System.out.println("Clip Fehler");
        }
        finally {
            System.out.println("Hallo");
        }

    }
}
