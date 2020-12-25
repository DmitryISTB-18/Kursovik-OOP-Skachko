package com.company.model;

import com.company.BaseData;
import com.company.object.MatPlat;
import com.company.object.Proc;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableModel4 extends AbstractTableModel {

    List<MatPlat> matplat;

    {
        try {
           matplat = BaseData.getAllMatPlat();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return matplat.size();
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
                return "Мат.плата";
            case 2:
                return "Фирма";
            case 3:
                return "Цена";
        }
        return "";
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MatPlat bean = matplat.get(rowIndex);
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