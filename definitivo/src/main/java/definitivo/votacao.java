package definitivo;
import javax.swing.JOptionPane;


public class votacao {
    
        int Rodrigo = 22;
        int Ananias = 98;
        int Rosângela = 73;
        int Augusto = 41;
        int Joana = 28;
        int Eliana = 11;
    
        public String[] nomes = new String[]{"Rodrigo","Ananias","Rosângela","Augusto","Joana", "Eliana"};
    
        public int[] valores = new int[]{0,0,0,0,0,0};
        
        public int[] candidatos =  new int[] {Rodrigo, Ananias, Rosângela, Augusto, Joana, Eliana};
        
    public void ordenacao_por_bolha(String nomes[], int valores[], int candidatos[])
    { 
        
        char confirma;
        int opcoes;
        
        int somaRodrigo = 0;
        int somaAnanias = 0;
        int somaRosângela = 0;
        int somaAugusto = 0;
        int somaJoana = 0;
        int somaEliana = 0;
        
        int totalVotos = 0;
        
        int PorcentagemRodrigo;
        int PorcentagemAnanias;
        int PorcentagemRosangela;
        int PorcentagemAugusto;
        int PorcentagemJoana;
        int PorcentagemEliana;
        
        do{
            
        opcoes = Integer.parseInt(JOptionPane.showInputDialog("          VOTAÇÃO \n" 
                                    + "Para Rodrigo vote [22]\n"    
                                    + "Para Ananias vote [98]\n"
                                    + "Para Rosângela vote [73]\n"
                                    + "Para Augusto vote [41]\n"
                                    + "Para Joana vote [28]\n"
                                    + "Para Eliana vote [11]\n"
                                    +"\n"
                                    + "Digite o Numero do seu candidato!\n" ));
            
            switch (opcoes){        // casos = números dos candidatos.
                
            case 22:
                
                confirma = JOptionPane.showInputDialog("Candidato Rodrigo!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaRodrigo ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                
                break ;
                
            case 98:
                
                confirma = JOptionPane.showInputDialog("Candidato Ananias!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaAnanias ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 73:
                
                confirma = JOptionPane.showInputDialog("Candidata Rosângela!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaRosângela ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 41:
                
                confirma = JOptionPane.showInputDialog("Candidato Augusto!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaAugusto ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 28:
                
                confirma = JOptionPane.showInputDialog("Candidata Joana!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaJoana ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 11:
                
                confirma = JOptionPane.showInputDialog("Candidata Eliana!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaEliana ++;
                    totalVotos ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
            case 0:
                
                JOptionPane.showMessageDialog(null, "Votacao encerrada. \n\n" + "Quantidade de Votos \n" + 
                                                    "rodrigo: " + somaRodrigo +"\n" +
                                                    "Ananias: " + somaAnanias +"\n"+
                                                    "Rosângela: "+ somaRosângela+ "\n" +
                                                    "Augusto: "+ somaAugusto + "\n"+
                                                    "Joana: "+ somaJoana + "\n"+
                                                    "Eliana: "+ somaEliana +"\n\n"+
                                                    "Votação Total: "+ totalVotos);
                
                    PorcentagemRodrigo = (somaRodrigo * 100) / totalVotos;
                    PorcentagemAnanias = (somaAnanias * 100) / totalVotos;
                    PorcentagemRosangela = (somaRosângela * 100) / totalVotos;
                    PorcentagemAugusto = (somaAugusto * 100) / totalVotos;
                    PorcentagemJoana = (somaJoana * 100) / totalVotos;
                    PorcentagemEliana = (somaEliana * 100) / totalVotos;
                    
                if (PorcentagemRodrigo >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Rodrigo foi eleito com " + PorcentagemRodrigo + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemAnanias >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Ananias foi eleito com " + PorcentagemAnanias + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemRosangela >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Rosangela foi eleita com " + PorcentagemRosangela + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemAugusto >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Augusto foi eleito com " + PorcentagemAugusto + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemJoana >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Joana foi eleita com " + PorcentagemJoana + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemEliana >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Eliana foi eleita com " + PorcentagemEliana + "% Votos.");
                    System.exit(0);
                    break;
                }// fim do primeiro turno
                
            if (opcoes != 22 && opcoes != 98 && opcoes != 73 && opcoes != 41 && opcoes != 28 && opcoes != 11 && opcoes != 0) {
                
                
                confirma = JOptionPane.showInputDialog("Número invalido! \n"
                                                        + "Digite 1 para anular ou 2 para retornar ao menu ! ").charAt(0);
                if (confirma == 1) {
                    
                    JOptionPane.showInputDialog(null, "Seu voto foi anulado!");
                    
                    totalVotos ++;
                    break;
                }
                if(confirma == 2){
                    
                    totalVotos ++;
                    break;
                }
                
                valores[0] = somaRodrigo;
                valores[1] = somaAnanias;
                valores[2] = somaRosângela;
                valores[3] = somaAugusto; 
                valores[4] = somaJoana;
                valores[5] = somaEliana;
                
                int valAux, tam = valores.length;
                int candidatoaux;
                String nomeAux;
                
                for(int i = 0; i <  tam - 1; i++)
                    for(int j = 0; j < tam - i - 1; j++)
                        if(valores[j] < valores[j+1]){

                            valAux = valores[j]; 
                            valores[j] = valores[j+1];
                            valores[j+1] = valAux;
                            
                            nomeAux = nomes[j]; 
                            nomes[j] = nomes[j+1];
                            nomes[j+1] = nomeAux;
                            
                            candidatoaux = candidatos[j]; 
                            candidatos[j] = candidatos[j+1];
                            candidatos[j+1] = candidatoaux;
                
                }
            }
        }
    }while(opcoes != 0);
}
    
    public void imprimeMaiores(){
        
    ordenacao_por_bolha(nomes, valores, candidatos);
    
                    
        int opcoes2turno;
        char confirma;
        
        int somaRodrigo2 = 0;
        int somaAnanias2 = 0;
        int somaRosângela2 = 0;
        int somaAugusto2 = 0;
        int somaJoana2 = 0;
        int somaEliana2 = 0;
        
        int totalVotos2turno = 0;
        
        int PorcentagemRodrigo2turno;
        int PorcentagemAnanias2turno;
        int PorcentagemRosangela2turno;
        int PorcentagemAugusto2turno;
        int PorcentagemJoana2turno;
        int PorcentagemEliana2turno;
        
        
        int n = valores.length;
        int i = 0;
        
       if (i <= n)
            
        JOptionPane.showMessageDialog(null,"Candidatos do segundo turno: " + "\n" +
                                                    "Primeiro: " + nomes[0] + "\n" +
                                                    "Segundo: "+ nomes[1] + "\n" );
            
        do{
            
            opcoes2turno = Integer.parseInt(JOptionPane.showInputDialog("          VOTAÇÃO 2 TURNO \n" +
                                                                                    "Para" + " " + nomes[0] + " " + "vote" + " " + candidatos[0] +": \n" 
                                                                                    + "Para" +" " + nomes[1] + " " + "vote" + " " +candidatos[1] + ": \n"));
            
            switch (opcoes2turno){
                
                case 22:
                
                confirma = JOptionPane.showInputDialog("Candidato Rodrigo!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaRodrigo2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                
                break ;
                
            case 98:
                
                confirma = JOptionPane.showInputDialog("Candidato Ananias!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaAnanias2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 73:
                
                confirma = JOptionPane.showInputDialog("Candidata Rosângela!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaRosângela2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 41:
                
                confirma = JOptionPane.showInputDialog("Candidato Augusto!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaAugusto2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 28:
                
                confirma = JOptionPane.showInputDialog("Candidata Joana!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaJoana2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 11:
                
                confirma = JOptionPane.showInputDialog("Candidata Eliana!\n"
                                            + "Digite 1 para cofirmar o seu voto ou 2 para sair: ").charAt(0);
                
                if (confirma == '1')
                {
                    JOptionPane.showMessageDialog(null, "Votacao realizada.");
                    
                    somaEliana2 ++;
                    totalVotos2turno ++;
                }
                if (confirma == 2)
                {
                    JOptionPane.showMessageDialog(null, "Voto cancelado.");
                }
                break;
                
            case 0:
                
                JOptionPane.showMessageDialog(null, "Votação encerrada ! " );
                
                    PorcentagemRodrigo2turno = (somaRodrigo2 * 100) / totalVotos2turno;
                    PorcentagemAnanias2turno = (somaAnanias2 * 100) / totalVotos2turno;
                    PorcentagemRosangela2turno = (somaRosângela2 * 100) / totalVotos2turno;
                    PorcentagemAugusto2turno = (somaAugusto2 * 100) / totalVotos2turno;
                    PorcentagemJoana2turno = (somaJoana2 * 100) / totalVotos2turno;
                    PorcentagemEliana2turno = (somaEliana2 * 100) / totalVotos2turno;
                    
                if (PorcentagemRodrigo2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Rodrigo foi eleito com " + PorcentagemRodrigo2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemAnanias2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Ananias foi eleito com " + PorcentagemAnanias2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemRosangela2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Rosangela foi eleita com " + PorcentagemRosangela2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemAugusto2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "O Candidato Augusto foi eleito com " + PorcentagemAugusto2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemJoana2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Joana foi eleita com " + PorcentagemJoana2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                if (PorcentagemEliana2turno >= 51) {
                    JOptionPane.showMessageDialog(null, "A Candidata Eliana foi eleita com " + PorcentagemEliana2turno + "% Votos.");
                    System.exit(0);
                    break;
                }
                
                    else{

                        JOptionPane.showMessageDialog(null, "O caso será julgado pela Justiça Eleitoral ! \n");
                    }
            }
            }while(opcoes2turno != 0);
    }
}