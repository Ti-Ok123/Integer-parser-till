import utils.List;

public class Analyse {
    private String eingabe;
    private List<Token> tokenliste;
    private Scanner scanner;
    private Parser parser;

    public Analyse(String pEingabe) {
        eingabe = pEingabe;
        tokenliste = new List<>();
        scanner = new Scanner(eingabe, tokenliste);
        parser = new Parser(tokenliste);
    }

    public void analysiere() {
        scanner.scanne();
        parser.parse();
    }


    public static void main(String[] args) {
        Analyse analyse;
        analyse = new Analyse("+003#");
        analyse.analysiere();
    }


}