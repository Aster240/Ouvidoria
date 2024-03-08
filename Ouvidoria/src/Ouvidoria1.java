import javax.swing.JOptionPane;
import java.util.ArrayList;
//Criar uma etapa de inserir reclamação, lista-las e exclui-las
public class Ouvidoria1 {
    public static void main(String[] args) {
  //1 = listar, 2 = adicionar, 3 = remover,  4 = sair
    int opção = 3;
    ArrayList<String> reclamações = new ArrayList<>();
while (opção != 4) {
    String opçãoStr = JOptionPane.showInputDialog("Menu \n 1.listar, 2.Adiicionar, 3.Remover, 4.SAir \n  Digite a sua opção: ");
   opção = Integer.parseInt(opçãoStr);

    if (opção == 1){
        for (String item : reclamações){
            JOptionPane.showMessageDialog(null, "reclamações: " + item);
        }
        
    } else if (opção == 2) {
        String novaReclamação= JOptionPane.showInputDialog("Faça aqui sua reclamação: ");
        reclamações.add(novaReclamação);
        JOptionPane.showMessageDialog(null,"Reclamação feita com sucesso. ;)");

        
    } else if (opção == 3) {

        
    }
}
JOptionPane.showMessageDialog(null, "obrigado por utilizar nossa ouvidoria.");

    }
}

