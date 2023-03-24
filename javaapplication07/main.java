
package javaapplication07;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
      
        
        
        //aluno alunoSenai = new aluno();
        //alunoSenai.idade = 25;
        //alunoSenai.nome = "Xarlos";
        
        /* aluno alunoSenai = new aluno();
        alunoSenai.setNome("Xarles");
        alunoSenai.setIdade(25);
        alunoSenai.setMatricula("00253877");
        alunoSenai.setEmail("xarles@gamil.com");
        alunoSenai.setCpf("24547842145412");
        
        System.out.println("nome do aluno é:" +alunoSenai.getNome());
        System.out.println("Idade do aluno é:" +alunoSenai.getIdade());
        System.out.println("Sua matricula é:" +alunoSenai.getMatricula());
        System.out.println("Seu CPF é:" +alunoSenai.getCpf());
        System.out.println("Seu email é:" +alunoSenai.getEmail());
        */
            //pedindo informação do teclado
        //Scanner teclado = new Scanner (System.in);
        
        //professor professorSenai = new professor();
        //professorSenai.setNome("José");
        //professorSenai.setMatricula(2313211);
        //professorSenai.setIdade(25);
        //professorSenai.setEmail("josé@gmail.com");
        
            //System.out.println("Informe seu nome:"); pede informação ao usuário
        //System.out.println("Informe seu nome:");
            /*professorSenai.setNome(teclado.nextLine()); atribuindo o que o usuário
            digitou no teclado*/
        //professorSenai.setNome(teclado.nextLine());
        
        //System.out.println("Informe sua idade:");
        //professorSenai.setIdade(teclado.nextInt());
        
        //System.out.println("Informe sei email:");
        //professorSenai.setEmail(teclado.next());
        
        //System.out.println("Informe sua matricula:");
        //professorSenai.setMatricula(teclado.nextInt());
        
            //Utilizando construtor
        professor professorSenai = new professor(20, "xarles", 64765, "xarles@gmail.com");
        
        
        System.out.println("Seu nome é:" +professorSenai.getNome());
        System.out.println("Sua idade é:" +professorSenai.getIdade());
        System.out.println("Sua matricula é:" +professorSenai.getMatricula());
        System.out.println("Seu email é:" +professorSenai.getEmail());
        
        
        
        
        
        
        
        
        

    }
    
}
