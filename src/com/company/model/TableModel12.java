package com.company.model;

import com.company.BaseData;
import com.company.object.HddSdd;
import com.company.object.Oxlajdenie;
import com.company.object.Proc;

import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TableModel12 extends AbstractTableModel {

    List<Oxlajdenie> oxl;

    {
        try {
            oxl = BaseData.getAllOxl();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getRowCount() {
        return oxl.size();
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
                return "Охлаждение";
            case 2:
                return "Фирма";
            case 3:
                return "Цена";
        }
        return "";
    }
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Oxlajdenie bean = oxl.get(rowIndex);
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