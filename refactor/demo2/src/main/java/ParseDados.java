/**
 * Classe que contém métodos para efetuar parsing de dados.
 *
 * @version 20190415
 */

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Random;

public class ParseDados {

    private static Utilizador parseUtilizador(String linha){
        String nome, nif, email, morada;
        String[] dados = linha.split(",");
        int ano = new Random().ints(1950, 2000).findFirst().getAsInt();
        int mes = new Random().ints(0, 11).findFirst().getAsInt();
        int dia = new Random().ints(1, 31).findFirst().getAsInt();
        GregorianCalendar date = new GregorianCalendar(ano, mes, dia);

        nome = dados[0];
        nif = dados[1];
        email = dados[2];
        morada = dados[3];

        return new Utilizador(nome, nif, email, nif, morada, date);
    }

    public static Proprietario parseProprietario(String linha) {
        Utilizador u = parseUtilizador(linha);
        return new Proprietario(u.getNome(), u.getNIF(), u.getEmail(), u.getPassword(), u.getMorada(), u.getDataNasc());
    }

    public static Cliente parseCliente(String linha) {
        Utilizador u = parseUtilizador(linha);
        String[] dados = linha.split(",");
        Coordinate cords;
        double x = 0.0, y = 0.0;
        try {
            x = Double.parseDouble(dados[4]);
            y = Double.parseDouble(dados[5]);
        } catch (InputMismatchException ignored) {
        }
        cords = new Coordinate(x, y);
        return new Cliente(u.getNome(), u.getNIF(), u.getEmail(), u.getPassword(), u.getMorada(), u.getDataNasc(), cords, 0, 0, 0.0);
    }

    public static Veiculo parseVeiculo(String linha) {
        String[] dados = linha.split(",");
        Veiculo veiculo;

        switch (dados[0]) {
            case "Electrico":
                veiculo = parseCarroEletrico(linha);
                break;
            case "Hibrido":
                veiculo = parseCarroHibrido(linha);
                break;
            case "Gasolina":
                veiculo = parseCarroGasolina(linha);
                break;
            default:
                veiculo = new Veiculo();
                break;

        }
        return veiculo;
    }

    private static Veiculo parseCarro(String linha){
        String marca, matricula, nif;
        String[] dados = linha.split(",");
        int velocidade, autonomia;
        double x, y, preco, consumo;

        marca = dados[1];
        matricula = dados[2];
        nif = dados[3];

        try {
            velocidade = Integer.parseInt(dados[4]);
            preco = Double.parseDouble(dados[5]);
            consumo = Double.parseDouble(dados[6]);
            autonomia = Integer.parseInt(dados[7]);
            x = Double.parseDouble(dados[8]);
            y = Double.parseDouble(dados[9]);
        } catch (InputMismatchException exc) {
            return new Veiculo();
        }

        Coordinate cords = new Coordinate(x, y);
        return new Veiculo(marca,
                matricula,
                nif,
                velocidade,
                preco,
                consumo,
                autonomia,
                cords,
                true,
                0,
                new ArrayList<ParDatas>());
    }

    private static CarroEletrico parseCarroEletrico(String linha) {
        Veiculo v = parseCarro(linha);
        return new CarroEletrico(
                v.getMarca(),
                v.getMatricula(),
                v.getNIF(),
                v.getVelocidade(),
                v.getPreco(),
                v.getConsumo(),
                v.getAutonomia(),
                v.getPosicao(),
                v.getDisponibilidade(),
                v.getClassificacao(),
                v.getDatasAlugueres());
    }

    private static CarroGasolina parseCarroGasolina(String linha) {
        Veiculo v = parseCarro(linha);
        return new CarroGasolina(
                v.getMarca(),
                v.getMatricula(),
                v.getNIF(),
                v.getVelocidade(),
                v.getPreco(),
                v.getConsumo(),
                v.getAutonomia(),
                v.getPosicao(),
                v.getDisponibilidade(),
                v.getClassificacao(),
                v.getDatasAlugueres());
    }

    private static CarroHibrido parseCarroHibrido(String linha) {
        Veiculo v = parseCarro(linha);
        return new CarroHibrido(
                v.getMarca(),
                v.getMatricula(),
                v.getNIF(),
                v.getVelocidade(),
                v.getPreco(),
                v.getConsumo(),
                v.getAutonomia(),
                v.getPosicao(),
                v.getDisponibilidade(),
                v.getClassificacao(),
                v.getDatasAlugueres());
    }
}
