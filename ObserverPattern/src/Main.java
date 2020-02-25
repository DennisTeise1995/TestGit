public class Main {

    public static void main(String[] args) {


        TeiseVersicherung stelleHarena = new TeiseVersicherung();

        Kunde Peter = new Peter();
        Kunde Fritz = new Fritz();

        stelleHarena.Kundehinzufügen(Peter);
        stelleHarena.Kundehinzufügen(Fritz);

        Formular neuesFormular = new Formular("Hagelschade");

        stelleHarena.erstelleNeuesFormular(neuesFormular);
    }
}
