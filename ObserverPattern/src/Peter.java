public class Peter implements Kunde
{
    @Override
    public void FormularAnKunde(Formular formular){
        System.out.println("Schicke FOrmular "+ formular.getName() +" nach Hamburg");
    }
}
