package operadorternario;
public class OperadorTernario {
    public static void main(String[] args) {
        //Operadores ternários com Operadores Relacionais
        System.out.println("Operador Ternario usando (if e else): ");
        int n1 = 10, n2 = 10;
        String nMaior = "N2 não é maior nem igual a N1!!!";
        if(n1<n2||n1==n2){ // Ou <=
            System.out.println(n1);
        }
        else{
            System.out.println(nMaior);
        }
        System.out.println();
        //É a mesma coisa que:
        System.out.println("Operador Ternario usando(? e :): ");
        int r = (n1 <= n2)?n1:n2;
        System.out.println(r);
    }
    
}
