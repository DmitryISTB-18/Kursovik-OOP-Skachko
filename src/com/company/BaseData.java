package com.company;
import com.company.model.TableModel;
import com.company.object.*;


import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

import java.sql.*;
import java.util.*;

public class BaseData {
    // Объект, в котором будет храниться соединение с БД
    public static Connection connection;



    public static void Based() throws SQLException, ClassNotFoundException {
        // Регистрируем драйвер, с которым будем работать
        // в нашем случае Sqlite

        Class.forName("org.sqlite.JDBC");
        // Выполняем подключение к базе данных
        connection = DriverManager.getConnection("jdbc:sqlite:baseob.db");
    }
    public static List<Proc> getAllProc() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Proc> proc = new ArrayList<Proc>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM proc");
            // Проходимся по нашему resultSet и заносим данные в proc
            while (resultSet.next()) {
                proc.add(new Proc(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return proc;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<OpPam> getAllOpPam() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<OpPam> oppam = new ArrayList<OpPam>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM oppam");
            // Проходимся по нашему resultSet и заносим данные в oppam
            while (resultSet.next()) {
                oppam.add(new OpPam(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return oppam;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Korpus> getAllOpBlock() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Korpus> korpus = new ArrayList<Korpus>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM block");
            // Проходимся по нашему resultSet и заносим данные в opblock
            while (resultSet.next()) {
                korpus.add(new Korpus(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return korpus;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<MatPlat> getAllMatPlat() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<MatPlat> matplat = new ArrayList<MatPlat>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM matplat");
            // Проходимся по нашему resultSet и заносим данные в matplat
            while (resultSet.next()) {
                matplat.add(new MatPlat(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return matplat;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<HddSdd> getAllMHddSdd() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<HddSdd> hddsdd = new ArrayList<HddSdd>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM hddSdd");
            // Проходимся по нашему resultSet и заносим данные в hddsdd
            while (resultSet.next()) {
                hddsdd.add(new HddSdd(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return hddsdd;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<VidKart> getAllVidKart() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<VidKart> vidkarta = new ArrayList<VidKart>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM vidkarta");
            // Проходимся по нашему resultSet и заносим данные в vidkrat
            while (resultSet.next()) {
                vidkarta.add(new VidKart(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return vidkarta;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<BlockPit> getAllBlockPit() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<BlockPit> blockpit = new ArrayList<BlockPit>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM blockpit");
            // Проходимся по нашему resultSet и заносим данные в blockpit
            while (resultSet.next()) {
                blockpit.add(new BlockPit(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return blockpit;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Mouse> getAllMouse() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Mouse> mouse = new ArrayList<Mouse>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM mouse");
            // Проходимся по нашему resultSet и заносим данные в mouse
            while (resultSet.next()) {
                mouse.add(new Mouse(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return mouse;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Klav> getAllKlav() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Klav> klava = new ArrayList<Klav>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM klava");
            // Проходимся по нашему resultSet и заносим данные в klav
            while (resultSet.next()) {
                klava.add(new Klav(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return klava;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Monitor> getAllMon() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Monitor> monitor = new ArrayList<Monitor>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM monitor");
            // Проходимся по нашему resultSet и заносим данные в mon
            while (resultSet.next()) {
                monitor.add(new Monitor(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return monitor;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Privod> getAllPrivod() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Privod> privod = new ArrayList<Privod>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM privod");
            // Проходимся по нашему resultSet и заносим данные в privod
            while (resultSet.next()) {
                privod.add(new Privod(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return privod;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }
    public static List<Oxlajdenie> getAllOxl() throws SQLException, ClassNotFoundException {
        Based();
        // Statement используется для того, чтобы выполнить sql-запрос
        try (Statement statement = connection.createStatement()) {
            // В данный список будем загружать наши продукты, полученные из БД
            List<Oxlajdenie> oxl = new ArrayList<Oxlajdenie>();
            // В resultSet будет храниться результат нашего запроса,
            // который выполняется командой statement.executeQuery()
            ResultSet resultSet = statement.executeQuery("SELECT id, name, firm, price FROM oxl");
            // Проходимся по нашему resultSet и заносим данные в oxl
            while (resultSet.next()) {
                oxl.add(new Oxlajdenie(resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("firm"),
                        resultSet.getInt("price")));
            }
            connection.close();
            // Возвращаем наш список
            return oxl;

        } catch (SQLException e) {
            e.printStackTrace();
            // Если произошла ошибка - возвращаем пустую коллекцию
            return Collections.emptyList();
        }
    }

    public static void executeSQlQuery( String query, String message) throws SQLException, ClassNotFoundException {
        JobWithBase osn = new JobWithBase();
        Based();
        Statement statement;
        try{
            statement = connection.createStatement();
            if((statement.executeUpdate(query)) == 1)
            {
// refresh jtable data


                JOptionPane.showMessageDialog(null, "Данные "+message+" успешно");
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
