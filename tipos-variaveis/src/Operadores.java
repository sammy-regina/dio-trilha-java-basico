public class Operadores {
    public static void main(String[] args) {
        //Concatenação com +
       /*String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println(nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao ="1"+(1+1+1);
        System.out.println(concatenacao);*/

        //Operadores Unários
        
        /*int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = numero * -1; //para tornar o numero positivo novamente

        System.out.println(numero);*/

        //repetição (incrementando)

        /*int numero = 5;
         
        numero = numero + 2;

        System.out.println(numero);*/

        //Operador Ternário

        /*int a, b;

        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";//se a for = a b verdadeiro, se não falso
       
        System.out.println(resultado);*/

        //Operadores Relacionais (utilizado para numeros, para objetos utiliza-se equals)

        /*int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        
    System.out.println("numero um é igual a numero dois? " + simNao);

    simNao = numero1 != numero2;

    System.out.println("numero um é diferente de numero dois? " + simNao);

    simNao = numero1 > numero2;

    System.out.println("numero um é maior que numero dois? " + simNao);*/

    //Operadores Lógicos
    
    boolean condicao1 = true;
    boolean condicao2 = false;

    if(condicao1 && condicao2){
        System.out.println("As duas condições são verdadeiras");
    }
    if(condicao1 || condicao2){
        System.out.println("Uma das condições é verdadeira");
    }
    
    System.out.println("Fim");

    }

}
