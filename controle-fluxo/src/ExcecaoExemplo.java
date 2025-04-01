import java.text.NumberFormat;
import java.text.ParseException;

public class ExcecaoExemplo {
    public static void main(String[] args) {

        Number valor;
        
        try {
            valor = NumberFormat.getInstance().parse("a1.75");

        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Number valor = Double.valueOf("a1.75");
        //System.out.println(valor);

    }

}
