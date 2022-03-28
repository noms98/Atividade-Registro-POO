import java.util.Scanner; //Importação da classe Scanner
public class MEduardaQuestao1 {
public static void main(String[] args) { //inicialização do método
Scanner sc = new Scanner(System.in); //declaração de que o usuário vai digitar

RegistroAutomovel a1 = new RegistroAutomovel(); //declaração de registro do automóvel

System.out.println ("Insira a marca do Automóvel:"); //interação com o usuário, que solicita o nome do automóvel
a1.marca = sc.nextLine(); //guarda o conteúdo inserido pelo usuário na variável "marca" que foi criada e no registro do automóvel"a1"

System.out.println ("Insira o modelo:"); //interação com o usuário, que solicita o modelo do automóvel
a1.modelo = sc.nextLine(); //guarda o conteúdo inserido pelo usuário na variável "modelo" que foi criada e no registro do automóvel"a1"

System.out.println ("Insira o ano de fabricação:"); //interação com o usuário, que solicita o ano de fabricação do automóvel
a1.ano = sc.nextInt(); //guarda o conteúdo inserido pelo usuário na variável "ano" que foi criada e no registro do automóvel"a1"

System.out.println ("Insira a quantidade máxima de passageiros permitida:"); //interação com o usuário, que solicita os passageiros do automóvel
a1.passageiros = sc.nextInt(); //guarda o conteúdo inserido pelo usuário na variável "passageiros" que foi criada e no registro do automóvel"a1"

System.out.println ("*Informações sobre o Automóvel*");
System.out.println ("Marca: " +a1.marca); //apresentação do registro da marca do automóvel digitado pelo usuário
System.out.println ("Modelo: " +a1.modelo); //apresentação do registro do modelo do automóvel digitado pelo usuário
System.out.println ("Ano de fabricação: " +a1.ano); //apresentação do registro do ano de fabricação do automóvel digitado pelo usuário
System.out.println ("Quantidade máxima de passageiros permitida: " +a1.passageiros); //apresentação do registro dos passageiros do automóvel digitado pelo usuário

}
}
