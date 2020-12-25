package com.company;

import com.company.model.*;
import com.company.object.Proc;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class JobWithBase extends JFrame{
    private JPanel center;
    private JPanel west;
    private JPanel niz1;

    private JLabel id1;
    private JLabel name1;
    private JLabel firm1;
    private JLabel price1;

    private JTextField id;
    private JTextField name;
    private JTextField firm;
    private JTextField price;


    TableModel processor = new TableModel();
    TableModel2 oppamat = new TableModel2();
    TableModel3 koppus = new TableModel3();
    TableModel4 mater = new TableModel4();
    TableModel5 hdddi = new TableModel5();
    TableModel6 videos = new TableModel6();
    TableModel7 blocke = new TableModel7();
    TableModel8 mouses = new TableModel8();
    TableModel9 klava = new TableModel9();
    TableModel10 monitor = new TableModel10();
    TableModel11 privodok = new TableModel11();
    TableModel12 oxlaj = new TableModel12();

     JTable proc = new JTable(processor);
    private JTable opPam = new JTable(oppamat);
    private JTable korp = new JTable(koppus);
    private JTable matplat = new JTable(mater);
    private JTable hddSdd = new JTable(hdddi);
    private JTable video = new JTable(videos);
    private JTable block = new JTable(blocke);
    private JTable mouse = new JTable(mouses);
    private JTable klav = new JTable(klava);
    private JTable mon = new JTable(monitor);
    private JTable privod = new JTable(privodok);
    private JTable oxl = new JTable(oxlaj);



    private JButton add;
    private JButton add1;
    private JButton delete1;
    private JButton delete;
    private JButton add2;
    private JButton delete2;
    private JButton add3;
    private JButton delete3;
    private JButton add4;
    private JButton delete4;
    private JButton add5;
    private JButton delete5;
    private JButton add6;
    private JButton delete6;
    private JButton add7;
    private JButton delete7;
    private JButton add8;
    private JButton delete8;
    private JButton add9;
    private JButton delete9;
    private JButton add10;
    private JButton delete10;
    private JButton add11;
    private JButton delete11;

    public JobWithBase () throws SQLException, ClassNotFoundException {

        super("Конфигурация компьютера:");
        center = new JPanel(new GridLayout(2, 6, 12, 10));

        delete = new JButton("Удалить процессор");
        add = new JButton("Добавить процессор");
        delete1 = new JButton("Удалить оп.память");
        add1 = new JButton("Добавить оп.память");
        delete2 = new JButton("Удалить корпус");
        add2 = new JButton("Добавить корпус");
        delete3 = new JButton("Удалить мат.плату");
        add3 = new JButton("Добавить мат.плату");
        delete4 = new JButton("Удалить HddSdd");
        add4 = new JButton("Добавить HddSdd");
        delete5 = new JButton("Удалить видеокарту");
        add5 = new JButton("Добавить видеокарту");
        delete6 = new JButton("Удалить блок питания");
        add6 = new JButton("Добавить блок питатния");
        delete7 = new JButton("Удалить комп.мышь");
        add7 = new JButton("Добавить комп.мышь");
        delete8 = new JButton("Удалить клавиатуру");
        add8 = new JButton("Добавить клавиатуру");
        delete9 = new JButton("Удалить монитор");
        add9 = new JButton("Добавить монитор");
        delete10 = new JButton("Удалить опт.привод");
        add10 = new JButton("Добавить опт.привод");
        delete11 = new JButton("Удалить охлаждение");
        add11 = new JButton("Добавить охлаждение");

        west = new JPanel(new GridLayout(12, 2, 5, 5));
        niz1 = new JPanel(new GridLayout(1, 4,10, 20));

        id = new JTextField();
        name = new JTextField();

        firm = new JTextField();
        price = new JTextField();


        center.add(new JScrollPane(proc));
        proc.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTable();
        center.add(new JScrollPane(opPam));
        opPam.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTable1();
        center.add(new JScrollPane(korp));
        korp.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTable2();
        center.add(new JScrollPane(matplat));
        this.setTable3();
        matplat.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(hddSdd));
        this.setTable4();
        hddSdd.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(video));
        this.setTable5();
        video.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(block));
        this.setTable6();
        block.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(mouse));
        this.setTable7();
        mouse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(klav));
        this.setTable8();
        klav.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(mon));
        this.setTable9();
        mon.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(privod));
        this.setTable10();
        privod.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        center.add(new JScrollPane(oxl));
        oxl.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        this.setTable11();

        west.add(add);
        west.add(delete);
        west.add(add1);
        west.add(delete1);
        west.add(add2);
        west.add(delete2);
        west.add(add3);
        west.add(delete3);
        west.add(add4);
        west.add(delete4);
        west.add(add5);
        west.add(delete5);
        west.add(add6);
        west.add(delete6);
        west.add(add7);
        west.add(delete7);
        west.add(add8);
        west.add(delete8);
        west.add(add9);
        west.add(delete9);
        west.add(add10);
        west.add(delete10);
        west.add(add11);
        west.add(delete11);

        id1 = new JLabel("Введите id :");
        name1 = new JLabel("Введите название:");
        firm1 = new JLabel("Введите фирму:");
        price1 = new JLabel("Введите цену:");
        niz1.add(id1);
        niz1.add(id);
        niz1.add(name1);
        niz1.add(name);
        niz1.add(firm1);
        niz1.add(firm);
        niz1.add(price1);
        niz1.add(price);

        this.add(BorderLayout.CENTER, center);
        this.add(BorderLayout.WEST, west);
        this.add(BorderLayout.NORTH, niz1);

        setSize(1800,800);
        // реакции нажатия на кнопки


        add.setFont(new Font("Verdana", 1, 12));
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_InsertActionPerformed(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete.setFont(new Font("Verdana", 1, 12));
        delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_DeleteActionPerformed(evt);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add1.setFont(new Font("Verdana", 1, 12));
        add1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                    JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                }
                    jButton_Insert1ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete1.setFont(new Font("Verdana", 1, 12));
        delete1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete1ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add2.setFont(new Font("Verdana", 1, 12));
        add2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert2ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete2.setFont(new Font("Verdana", 1, 12));
        delete2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete2ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add3.setFont(new Font("Verdana", 1, 12));
        add3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert3ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete3.setFont(new Font("Verdana", 1, 12));
        delete3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete3ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add4.setFont(new Font("Verdana", 1, 12));
        add4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert4ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete4.setFont(new Font("Verdana", 1, 12));
        delete4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete4ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add5.setFont(new Font("Verdana", 1, 12));
        add5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert5ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete5.setFont(new Font("Verdana", 1, 12));
        delete5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete5ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add6.setFont(new Font("Verdana", 1, 12));
        add6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert6ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete6.setFont(new Font("Verdana", 1, 12));
        delete6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete6ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add7.setFont(new Font("Verdana", 1, 12));
        add7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert7ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete7.setFont(new Font("Verdana", 1, 12));
        delete7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete7ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add8.setFont(new Font("Verdana", 1, 12));
        add8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert8ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete8.setFont(new Font("Verdana", 1, 12));
        delete8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete8ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add9.setFont(new Font("Verdana", 1, 12));
        add9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert9ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete9.setFont(new Font("Verdana", 1, 12));
        delete9.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete9ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add10.setFont(new Font("Verdana", 1, 12));
        add10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert10ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete10.setFont(new Font("Verdana", 1, 12));
        delete10.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete10ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
        add11.setFont(new Font("Verdana", 1, 12));
        add11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty()){
                        JOptionPane.showMessageDialog(null, "Ошибка!Необходимо заполнить все поля!");
                    }
                    jButton_Insert11ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });

        delete11.setFont(new Font("Verdana", 1, 12));
        delete11.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                try {
                    if  (checkInputIsEmpty1()){
                        JOptionPane.showMessageDialog(null, "Нет данных для удаления!Введите id для удаления записи");
                    }
                    jButton_Delete11ActionPerformed(evt);

                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
// методы для кнопок добавления и удаления в которых прописаны скрипты SQL

    // INSERT
    BaseData zap = new BaseData();
    private void jButton_InsertActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {

        String query = "INSERT INTO `proc`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }



    // DELETE
    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `proc` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    // INSERT

    private void jButton_Insert1ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `oppam`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `oppam` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert2ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `block`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `block` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert3ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `matplat`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete3ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `matplat` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert4ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `hddSdd`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete4ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `hddSdd` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert5ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `vidkarta`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete5ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `vidkarta` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert6ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `blockpit`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete6ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `blockpit` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert7ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `mouse`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete7ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `mouse` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert8ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `klava`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `klava` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert9ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `monitor`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete9ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `monitor` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert10ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `privod`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete10ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `privod` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private void jButton_Insert11ActionPerformed(ActionEvent evt)  throws SQLException, ClassNotFoundException {
        String query = "INSERT INTO `oxl`(`id`, `name`, firm, 'price' ) VALUES ('" + id.getText() + "','" + name.getText() + "','" + firm.getText() + "'," + price.getText() + ")";

        zap.executeSQlQuery(query, "добавлены");

    }

    // DELETE
    private void jButton_Delete11ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException, ClassNotFoundException {
        String query = "DELETE FROM `oxl` WHERE id = " + id.getText();
        zap.executeSQlQuery(query, "удалены");
    }
    private boolean checkInputIsEmpty() {
        return id.getText().toString().isEmpty() ||
                name.getText().toString().isEmpty() ||
                firm.getText().toString().isEmpty() ||
                price.getText().toString().isEmpty();

    }
    private boolean checkInputIsEmpty1() {
        return id.getText().toString().isEmpty();

    }
//  запреты и размеры
    public void setTable() {
        proc.getTableHeader().setReorderingAllowed(false);
        proc.getColumnModel().getColumn(0).setResizable(false);
        proc.getColumnModel().getColumn(1).setResizable(false);
        proc.getColumnModel().getColumn(2).setResizable(false);
        proc.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = proc.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable1() {
        opPam.getTableHeader().setReorderingAllowed(false);
        opPam.getColumnModel().getColumn(0).setResizable(false);
        opPam.getColumnModel().getColumn(1).setResizable(false);
        opPam.getColumnModel().getColumn(2).setResizable(false);
        opPam.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = opPam.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable3() {
        matplat.getTableHeader().setReorderingAllowed(false);
        matplat.getColumnModel().getColumn(0).setResizable(false);
        matplat.getColumnModel().getColumn(1).setResizable(false);
        matplat.getColumnModel().getColumn(2).setResizable(false);
        matplat.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = matplat.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable2() {
        korp.getTableHeader().setReorderingAllowed(false);
        korp.getColumnModel().getColumn(0).setResizable(false);
        korp.getColumnModel().getColumn(1).setResizable(false);
        korp.getColumnModel().getColumn(2).setResizable(false);
        korp.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = korp.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable4() {
        hddSdd.getTableHeader().setReorderingAllowed(false);
        hddSdd.getColumnModel().getColumn(0).setResizable(false);
        hddSdd.getColumnModel().getColumn(1).setResizable(false);
        hddSdd.getColumnModel().getColumn(2).setResizable(false);
        hddSdd.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = hddSdd.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable5() {
        video.getTableHeader().setReorderingAllowed(false);
        video.getColumnModel().getColumn(0).setResizable(false);
        video.getColumnModel().getColumn(1).setResizable(false);
        video.getColumnModel().getColumn(2).setResizable(false);
        video.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = video.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable6() {
        block.getTableHeader().setReorderingAllowed(false);
        block.getColumnModel().getColumn(0).setResizable(false);
        block.getColumnModel().getColumn(1).setResizable(false);
        block.getColumnModel().getColumn(2).setResizable(false);
        block.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = block.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable7() {
        mouse.getTableHeader().setReorderingAllowed(false);
        mouse.getColumnModel().getColumn(0).setResizable(false);
        mouse.getColumnModel().getColumn(1).setResizable(false);
        mouse.getColumnModel().getColumn(2).setResizable(false);
        mouse.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = mouse.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable8() {
        klav.getTableHeader().setReorderingAllowed(false);
        klav.getColumnModel().getColumn(0).setResizable(false);
        klav.getColumnModel().getColumn(1).setResizable(false);
        klav.getColumnModel().getColumn(2).setResizable(false);
        klav.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = klav.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable9() {
        mon.getTableHeader().setReorderingAllowed(false);
        mon.getColumnModel().getColumn(0).setResizable(false);
        mon.getColumnModel().getColumn(1).setResizable(false);
        mon.getColumnModel().getColumn(2).setResizable(false);
        mon.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = mon.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable10() {
        privod.getTableHeader().setReorderingAllowed(false);
        privod.getColumnModel().getColumn(0).setResizable(false);
        privod.getColumnModel().getColumn(1).setResizable(false);
        privod.getColumnModel().getColumn(2).setResizable(false);
        privod.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = privod.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }
    public void setTable11() {
        oxl.getTableHeader().setReorderingAllowed(false);
        oxl.getColumnModel().getColumn(0).setResizable(false);
        oxl.getColumnModel().getColumn(1).setResizable(false);
        oxl.getColumnModel().getColumn(2).setResizable(false);
        oxl.getColumnModel().getColumn(3).setResizable(false);
        TableColumn column = oxl.getColumnModel().getColumn(1);        column.setMinWidth(40);        column.setMaxWidth(100);        column.setPreferredWidth(200);
    }

}


