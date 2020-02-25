import java.util.ArrayList;
import java.util.List;

public class Versicherung
{
    private List<Kunde> Kundenliste = new ArrayList<>();
    Formular gültigesFormular;

    public void erstelleNeuesFormular(Formular formular){
        gültigesFormular = formular;
        Kundenbenachrichten(formular);
    }

    public Formular getGültigesFormular()
    {
        return gültigesFormular;
    }

    public void Kundehinzufügen(Kunde kunde){
        Kundenliste.add(kunde);
    }
    public void Kundeentfernen(Kunde kunde){
        Kundenliste.remove(kunde);
    }

    protected void Kundenbenachrichten(Formular formular){
        for (Kunde kunde: Kundenliste){
            kunde.FormularAnKunde(formular);
        }
    }

}
