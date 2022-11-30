import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;

public class Prova {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int colunas=0;


        System.out.println("Quantos funcionários haverão?");
        colunas = sc.nextInt();

        String[] Nomes = new String[colunas];
        Double[][] Informacoes = new Double[4][colunas];

        if(colunas>0){

            for (int nome=0; nome < colunas ; nome++){

                System.out.println("Informe o nome do "+(nome+1)+"° funcionário: ");
                Nomes[nome] = sc.next();
                sc.nextLine();

            }

            for(int l=0;l < 4 ; l++){

                for (int c=0;c <colunas; c++){

                if(l==0){

                    System.out.println("Informe o salário bruto do funcionário "+Nomes[c]+" :");
                    Informacoes[0][c] = sc.nextDouble();

                    if(Informacoes[0][c]<465.0){

                        System.out.println("Erro");

                    }
                    else{

                        if(Informacoes[0][c]<=965.67){

                            Informacoes[1][c] = Informacoes[0][c]*0.092;

                        }
                        if(Informacoes[0][c]>965.68 && Informacoes[0][c]<=1609.45){

                            Informacoes[1][c] = Informacoes[0][c]*0.091;

                        }
                        if(Informacoes[0][c]>1609.45 && Informacoes[0][c] <= 3218.90){

                            Informacoes[1][c] = Informacoes[0][c]*0.089;

                        }
                        if(Informacoes[0][c] > 3218.90){

                            Informacoes[1][c] = 354.07;

                        }

                        if(Informacoes[0][c] <= 1434.0){

                            Informacoes[2][c] = Informacoes[0][c]*1;

                        }
                        if(Informacoes[0][c] > 1434.0 && Informacoes[0][c] <= 2150.0){

                            Informacoes[2][c] = Informacoes[0][c]*0.0925;

                        }
                        if(Informacoes[0][c] > 2150.0 && Informacoes[0][c] <= 2886.0){

                            Informacoes[2][c] = Informacoes[0][c]*0.085;

                        }
                        if(Informacoes[0][c] > 2886.0 && Informacoes[0][c] <= 3582.0){

                            Informacoes[2][c] = Informacoes[0][c]*0.0775;

                        }
                        if(Informacoes[0][c] > 3582.0){

                            Informacoes[2][c] = Informacoes[0][c]*0.0725;

                        }
                        Informacoes[3][c] = Informacoes [0][c] - (Informacoes[1][c]+Informacoes[2][c]);



                    }

                }

                }

            }
            for (int c=0; c<colunas ; c++){
                System.out.println("---==============================---");
                System.out.println("Funcionario: "+Nomes[c]);
                System.out.println("Salario bruto: "+Informacoes[0][c]);
                System.out.println("Desconto INSS: "+Informacoes[1][c]);
                System.out.println("Desconto Imposto de Renda: "+Informacoes[2][c]);
                System.out.println("Salário liquido: "+Informacoes[3][c]);
                System.out.println("---==============================---");

            }

            double somaSalarioBruto = 0;

            for (int c=0; c<colunas ; c++){

                somaSalarioBruto += Informacoes[0][c];

            }

            double somaINSS = 0;

            for (int c=0; c<colunas ; c++){

                somaINSS += Informacoes[1][c];

            }

            double somaImpostodeRenda = 0;

            for (int c=0; c<colunas ; c++){

                somaImpostodeRenda += Informacoes[2][c];

            }

            double somaSalarioLiquido = 0;

            for (int c=0; c<colunas ; c++){

                somaSalarioLiquido += Informacoes[3][c];

            }
            System.out.println("---==============================---");
            System.out.println("-----------Somas-----------");
            System.out.println("Soma dos salários brutos: "+somaSalarioBruto);
            System.out.println("Soma dos percentuais de INSS: "+somaINSS);
            System.out.println("Soma dos percentuais de Imposto de Renda: "+somaImpostodeRenda);
            System.out.println("Soma dos salários liquidos: "+somaSalarioLiquido);
            System.out.println("---==============================---");




        }






    }

}
