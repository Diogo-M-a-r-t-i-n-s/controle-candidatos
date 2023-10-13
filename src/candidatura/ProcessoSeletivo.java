package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }
    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Diogo","Marcia","Julia","Paulo"};
        System.out.println("Imprimindo a Lista de Candidatos Informando o Índice do Elemento");
        for(int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de N: " + indice + " é " + candidatos[indice]);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe","Diogo","Marcia","Julia","Paulo","Monica","Renata","Danela","Jorge","Mirela"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou Este Valor de Salário: " + salarioPretendido );
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " Foi Selecionado Para a Vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;

        }
    }
    private static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido) {
            System.out.println("Ligar Para o Candidato!");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o Candidato com Contra Proposta!");
        }else{
            System.out.println("Aguardando Demais Candidato!");
        }

    }
}
