import java.util.Scanner;

public class prova {
    
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        double valorLitro, km60, km80, km100, km120, km140, custoTotal, veloMedia, consumoTotal, consumo60, consumo80, consumo100, consumo120, consumo140;
        String placa;

        System.out.println("Informe a placa do veiculo: ");
        placa = sc.nextLine();
        System.out.print("Informe o valor do litro de combustivel: ");
        valorLitro = sc.nextDouble();
        System.out.print("Informe a quantidade de quilometros rodados a 60 KM/H: ");
        km60 = sc.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 80 KM/H: ");
        km80 = sc.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 100 KM/H: ");
        km100 = sc.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 120 KM/H: ");
        km120 = sc.nextDouble();
        System.out.print("Informe a quantidade de quilômetros rodados a 140 KM/H: ");
        km140 = sc.nextDouble();

        consumo60 = 30.7;
        consumo80 = 26.8;
        consumo100 = 22.4;
        consumo120 = 18.1;
        consumo140 = 14.5;

        consumoTotal = km60 / consumo60 + km80 / consumo80 + km100 / consumo100 + km120 / consumo120 + km140 / consumo140;
        custoTotal = consumoTotal * valorLitro;
        veloMedia = (60 * km60 + 80 * km80 + 100 * km100 + 120 * km120 + 140 * km140) / (km60 + km80 + km100 + km120 + km140);

        System.out.println("Placa do veiculo: " + placa);
        System.out.printf("Consumo total: %.4f\nValor total: R$%.2f\nVelocidade media ponderada: %.4f", consumoTotal, custoTotal, veloMedia);

        sc.close();
    }
}