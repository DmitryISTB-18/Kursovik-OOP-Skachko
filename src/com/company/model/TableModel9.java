package com.company.model;

import com.company.BaseData;
import com.company.object.Klav;
import com.company.object.Proc;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableModel9 extends AbstractTableModel {

    List<Klav> klava;

    {
        try {
            klava = BaseData.getAllKlav();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return klava.size();
    }
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }
    @Override
    public int getColumnCount() {
        return 4;
    }
    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "№";
            case 1:
                return "Клавиатура";
            case 2:
                return "Фирма";
            case 3:
                return "Цена";
        }
        return "";
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Klav bean = klava.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return bean.getId();
            case 1:
                return bean.getName();
            case 2:
                return bean.getFirm();
            case 3:
                return bean.getPrice();
        }
        return "";
    }
}