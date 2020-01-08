/**
 * Classe que abstrai a utilização da classe Scanner, escondendo todos os
 * problemas relacionados com excepções, e que oferece métodos simples e
 * robustos para a leitura de valores de tipos simples e String.
 * <p>
 * É uma classe de serviços, como Math e outras de Java, pelo que devem ser
 * usados os métodos de classe implementados.
 * <p>
 * Utilizável em BlueJ, NetBeans, CodeBlocks ou Eclipse.
 * <p>
 * Utilização típica:  int x = Input.lerInt();
 * String nome = Input.lerString();
 *
 * @version 1.0 (6/2006)
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Input {

    /**
     * Métodos de Classe
     */

    public static String lerString(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        String txt = "";
        while (!ok) {
            try {
                txt = input.nextLine();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return txt;
    }


    public static int lerInt(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        int i = 0;
        while (!ok) {
            try {
                i = input.nextInt();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return i;
    }

    public static double lerDouble(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        double d = 0.0;
        while (!ok) {
            try {
                d = input.nextDouble();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return d;
    }

    public static float lerFloat(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        float f = 0.0f;
        while (!ok) {
            try {
                f = input.nextFloat();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return f;
    }

    public static boolean lerBoolean(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        boolean b = false;
        while (!ok) {
            try {
                b = input.nextBoolean();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return b;
    }

    public static short lerShort(String invalido, String novo) {
        Scanner input = new Scanner(in);
        boolean ok = false;
        short s = 0;
        while (!ok) {
            try {
                s = input.nextShort();
                ok = true;
            } catch (InputMismatchException e) {
                out.println(invalido);
                out.print(novo);
                input.nextLine();
            }
        }
        //input.close();
        return s;
    }

    public static GregorianCalendar lerData(String errorMessage, String message) {
        Scanner input = new Scanner(in);
        boolean dataValida = false;
        GregorianCalendar date = null;
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");
        String str = "";

        ft.setLenient(false);

        while (!dataValida) {
            str = Input.lerString(errorMessage, message);

            try {
                ft.parse(str);
            }
            catch (ParseException e) {
                out.println(errorMessage);
                out.print(message);
                continue;
            }

            try {
                date = parseData(str);
            } catch (NumberFormatException | NullPointerException e) {
                out.println(errorMessage);
                out.print(message);
                continue;
            }

            dataValida = true;
        }

        input.close();
        return date;
    }

    private static GregorianCalendar parseData(String dataString) throws NumberFormatException, NullPointerException{
        String[] fields = dataString.split("-");

        int d = Integer.parseInt(fields[0].trim());
        int m = Integer.parseInt(fields[1].trim());
        int y = Integer.parseInt(fields[2].trim());

        return new GregorianCalendar(y, --m, d);
    }

}