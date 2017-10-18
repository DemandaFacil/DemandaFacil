package controllers.grafico;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JFrame;
import org.jfree.ui.RefineryUtilities;

public class Main {
    public static void main( String[ ] args ) {
      
        
      //Nessa oção feita pelo for, será informada a quantidade que o produto irá ter em cada mês.
      //Para isso deve-se fazer a consulta no banco para buscar ela pelo período informado
      int n = 12;
      int qtde[] = new int[n];
      Random random = new Random();
      for(int i= 0; i<12 ;i++){
          qtde[i] = random.nextInt(101);
      }
      
      //Chama a classe do grafíco informando o vetor de quantidades e o inicio e fim do período 
      Grafico graf = new Grafico(qtde,1,11);
      graf.criaDados();
      
      //Aqui cria o frame mostrando o gráfico plotado
      JFrame frame = new JFrame("Estimativas");
      frame.add(graf.getPanel());
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.pack();
      frame.setVisible(true);

   }
        
        
        
}

