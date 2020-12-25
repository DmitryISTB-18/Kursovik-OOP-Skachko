package com.company;


import com.company.model.TableModel;
import com.company.model.TableModel2;
import com.company.model.TableModel3;
import com.company.model.TableModel4;
import com.company.model.TableModel5;
import com.company.model.TableModel6;
import com.company.model.TableModel7;
import com.company.model.TableModel8;
import com.company.model.TableModel9;
import com.company.model.TableModel10;
import com.company.model.TableModel11;
import com.company.model.TableModel12;

import java.awt.event.*;
import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;


public class ControllerAndView extends JFrame {

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


    private JTable proc = new JTable(processor);
    private TableRowSorter<TableModel> rowSorter = new TableRowSorter<>((TableModel) proc.getModel());
    private JTable opPam = new JTable(oppamat);
    private TableRowSorter<TableModel2> rowSorter1= new TableRowSorter<>((TableModel2) opPam.getModel());
    private JTable korp = new JTable(koppus);
    private TableRowSorter<TableModel3> rowSorter2= new TableRowSorter<>((TableModel3) korp.getModel());
    private JTable matplat = new JTable(mater);
    private TableRowSorter<TableModel4> rowSorter3= new TableRowSorter<>((TableModel4)matplat.getModel());
    private JTable hddSdd = new JTable(hdddi);
    private TableRowSorter<TableModel5> rowSorter4= new TableRowSorter<>((TableModel5) hddSdd.getModel());
    private JTable video = new JTable(videos);
    private TableRowSorter<TableModel6> rowSorter5= new TableRowSorter<>((TableModel6) video.getModel());
    private JTable block = new JTable(blocke);
    private TableRowSorter<TableModel7> rowSorter6= new TableRowSorter<>((TableModel7) block.getModel());
    private JTable mouse = new JTable(mouses);
    private TableRowSorter<TableModel8> rowSorter7= new TableRowSorter<>((TableModel8)mouse.getModel());
    private JTable klav = new JTable(klava);
    private TableRowSorter<TableModel9> rowSorter8= new TableRowSorter<>((TableModel9) klav.getModel());
    private JTable mon = new JTable(monitor);
    private TableRowSorter<TableModel10> rowSorter9= new TableRowSorter<>((TableModel10) mon.getModel());
    private JTable privod = new JTable(privodok);
    private TableRowSorter<TableModel11> rowSorter10= new TableRowSorter<>((TableModel11) privod.getModel());
    private JTable oxl = new JTable(oxlaj);
    private TableRowSorter<TableModel12> rowSorter11= new TableRowSorter<>((TableModel12) oxl.getModel());
    private ArrayList<Integer> kret = new ArrayList<Integer>();


    private JPanel center;
    private JPanel niz;
    private JPanel verx;

    private JTextArea content;

    private JLabel container;
    private JLabel poiska;

    private JButton dobAll;
    private JButton button;
    private JButton job;

    private JTextField stroka;

    public ControllerAndView() throws SQLException, ClassNotFoundException {
        super("Конфигурация компьютера:");

        // buttons
        dobAll = new JButton("Собрать ПК");
        button = new JButton("Очистить");
        job = new JButton("Работа с базой данных");

        poiska = new JLabel("Введите название детали, фирму или цену:");
        stroka = new JTextField(50);
        container = new JLabel("Ваша конфигурация:");
        content = new JTextArea(12, 30);

        center = new JPanel(new GridLayout(2, 6, 12, 10));
        niz = new JPanel(new FlowLayout());
        verx = new JPanel(new FlowLayout());
// Таблицы
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
        niz.add(container);

        niz.add(new JScrollPane(content));

        verx.add(poiska);
        verx.add(stroka);

        // Кнопки
        // Менеджер конмпановки
        this.setLocationByPlatform(true);
        niz.add(button);
        dobAll.setBounds(1300, 500, 160, 60);
        add(dobAll);
        job.setBounds(200, 500, 190, 60);
        add(job);

        this.add(BorderLayout.CENTER, center);
        this.add(BorderLayout.NORTH, verx);
        this.add(BorderLayout.SOUTH, niz);

        setSize(1650, 700);
        setVisible(true);
        setLocationRelativeTo(null);

        // поиск элементов в таблице
        proc.setRowSorter(rowSorter);

        stroka.getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }


        });
        opPam.setRowSorter(rowSorter1);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null);
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null);
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        opPam.setRowSorter(rowSorter1);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null);
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter1.setRowFilter(null);
                } else {
                    rowSorter1.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        korp.setRowSorter(rowSorter2);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter2.setRowFilter(null);
                } else {
                    rowSorter2.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter2.setRowFilter(null);
                } else {
                    rowSorter2.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        matplat.setRowSorter(rowSorter3);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter3.setRowFilter(null);
                } else {
                    rowSorter3.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter3.setRowFilter(null);
                } else {
                    rowSorter3.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        hddSdd.setRowSorter(rowSorter4);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter4.setRowFilter(null);
                } else {
                    rowSorter4.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter4.setRowFilter(null);
                } else {
                    rowSorter4.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        video.setRowSorter(rowSorter5);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter5.setRowFilter(null);
                } else {
                    rowSorter5.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter5.setRowFilter(null);
                } else {
                    rowSorter5.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        block.setRowSorter(rowSorter6);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter6.setRowFilter(null);
                } else {
                    rowSorter6.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter6.setRowFilter(null);
                } else {
                    rowSorter6.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        mouse.setRowSorter(rowSorter7);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter7.setRowFilter(null);
                } else {
                    rowSorter7.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter7.setRowFilter(null);
                } else {
                    rowSorter7.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        klav.setRowSorter(rowSorter8);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter8.setRowFilter(null);
                } else {
                    rowSorter8.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter8.setRowFilter(null);
                } else {
                    rowSorter8.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        mon.setRowSorter(rowSorter9);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter9.setRowFilter(null);
                } else {
                    rowSorter9.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter9.setRowFilter(null);
                } else {
                    rowSorter9.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        privod.setRowSorter(rowSorter10);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter10.setRowFilter(null);
                } else {
                    rowSorter10.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter10.setRowFilter(null);
                } else {
                    rowSorter10.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        oxl.setRowSorter(rowSorter11);
        stroka.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter11.setRowFilter(null);
                } else {
                    rowSorter11.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = stroka.getText();

                if (text.trim().length() == 0) {
                    rowSorter11.setRowFilter(null);
                } else {
                    rowSorter11.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
            }
            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        //кнопка собрать пк

        dobAll.addActionListener(new ActionListener() {

            @Override public void actionPerformed(ActionEvent ae) {

                JOptionPane.showMessageDialog(null, "Стомость вашего Пк: " + incassoMargherita()+ " рублей");

            }
        });
        //работы с базой
        JobWithBase base = new JobWithBase();
        job.addActionListener(new ActionListener() {

            @Override public void actionPerformed(ActionEvent ae) {

                base.setVisible(true);
            }
        });
        // добавление элементов в textarea
        proc.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                        for (int j = 0; j < column; j++) {
                            table[j] = jar.getModel().getValueAt(row, j);
                            content.append(String.valueOf( table[j]) + "\t");
                        }
                    Integer val = (Integer) proc.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                        content.append("\n");
                    }
                }
        });
        opPam.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");
                    }
                    Integer val = (Integer) opPam.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);

                    content.append("\n");
                }
            }
        });
        matplat.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object[] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf(table[j]) + "\t");
                        //content.setText(content.getText() + String.valueOf(proc.getModel().getValueAt(row, column) + "\n"));
                    }
                    Integer val = (Integer) matplat.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);

                    content.append("\n");

                }
            }

        });
        korp.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");

                    }
                    Integer val = (Integer) korp.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        video.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");

                    }
                    Integer val = (Integer) video.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        block.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");
                    }
                    Integer val = (Integer) block.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        mouse.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");

                    }
                    Integer val = (Integer) mouse.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        klav.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");
                    }
                    Integer val = (Integer) klav.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        mon.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");

                    }
                    Integer val = (Integer) mon.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        privod.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");
                    }
                    Integer val = (Integer) privod.getValueAt(row, 3); // запись цены в эррэйлист
                    kret.add(val);
                    content.append("\n");
                }
            }
        });
        oxl.addMouseListener(new MouseAdapter() {
            //
            public void mouseClicked(MouseEvent e) {
                //возвращает ссылку на объект
                if (e.getClickCount() == 2) {
                    JTable jar = (JTable) e.getSource();
                    int row = jar.getSelectedRow();
                    int column = jar.getColumnCount();
                    Object [] table = new Object[column];
                    for (int j = 0; j < column; j++) {
                        table[j] = jar.getModel().getValueAt(row, j);
                        content.append(String.valueOf( table[j]) + "\t");
                    }
                    Integer val = (Integer) oxl.getValueAt(row, 3); // value of ith row and 3rd column
                    kret.add(val);

                    content.append("\n");
                }
            }
        });
        // отчистить TEXt area и массив цен
        button.addActionListener(e -> content.setText(""));
        button.addActionListener(e -> kret.clear());
// Сумматор эррэйлиста
    }
    public Integer incassoMargherita() {
            int i;
            int sum = 0;
            for (i = 0; i < kret.size(); i++) {
                sum += kret.get(i);
            }
            return sum;
        }
    private boolean checkInputIsEmpty1() {
        return stroka.getText().toString().isEmpty();

    }

// запреты на изменение колонок размера и перестановки, а также установка размеров
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