public class Fritz implements Kunde
{
    @Override
    public void FormularAnKunde(Formular formular){
        System.out.println("Schicke FOrmular "+ formular.getName() +" nach Haren");
    }
}

