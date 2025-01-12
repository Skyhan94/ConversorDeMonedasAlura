import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int opcion = 0;
        double consulta;
        double valor;
        double total;
        Scanner lectura = new Scanner(System.in);
        ConsultaMoneda consultaMoneda = new ConsultaMoneda();
        Moneda moneda = consultaMoneda.buscaMoneda();
        Conversiones conversiones = new Conversiones();

        while (opcion != 7) {
            System.out.println("***********************************************************\n" +
                    "Sea bienvenido/a al conversor de monedas\n\n" +
                    "1) Dólar =>> Peso argentino\n" +
                    "2) Peso argentino =>> Dólar\n" +
                    "3) Dólar =>> Real brasileño\n" +
                    "4) Real brasileño =>> Dólar\n" +
                    "5) Dólar =>> Peso colombiano\n" +
                    "6) Peso colombiano =>> Dólar\n" +
                    "7) Salir\n" +
                    "Elija una opción valida:\n" +
                    "***********************************************************");

            try {
                opcion = lectura.nextInt();  // Captura de opción
                if (opcion < 1 || opcion > 7) {
                    System.out.println("Por favor, elija una opción válida entre 1 y 7.");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un valor numérico válido para la opción.");
                lectura.nextLine();  // Limpia el buffer de entrada
                continue;
            }

            if (opcion == 7) {
                System.out.println("Saliendo del programa...");
                break;
            }

            try {
                System.out.println("Ingrese el valor que desea convertir:");
                valor = lectura.nextDouble();  // Captura del valor a convertir

                switch (opcion) {
                    case 1:
                        consulta = moneda.getValorMonedaEnDolares("ARS");
                        total = conversiones.multiplicacion(valor, consulta);
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [ARS]");
                        break;
                    case 2:
                        consulta = moneda.getValorMonedaEnDolares("ARS");
                        total = conversiones.division(valor, consulta);
                        System.out.println("El valor " + valor + " [ARS] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [USD]");
                        break;
                    case 3:
                        consulta = moneda.getValorMonedaEnDolares("BRL");
                        total = conversiones.multiplicacion(valor, consulta);
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [BRL]");
                        break;
                    case 4:
                        consulta = moneda.getValorMonedaEnDolares("BRL");
                        total = conversiones.division(valor, consulta);
                        System.out.println("El valor " + valor + " [BRL] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [USD]");
                        break;
                    case 5:
                        consulta = moneda.getValorMonedaEnDolares("COP");
                        total = conversiones.multiplicacion(valor, consulta);
                        System.out.println("El valor " + valor + " [USD] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [COP]");
                        break;
                    case 6:
                        consulta = moneda.getValorMonedaEnDolares("COP");
                        total = conversiones.division(valor, consulta);
                        System.out.println("El valor " + valor + " [COP] corresponde al valor final de =>>> " + String.format("%.2f", total) + " [USD]");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un valor numérico para la conversión.");
                lectura.nextLine();
            } catch (Exception e) {
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }
    }
}
