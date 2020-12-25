package com.company.model;

import com.company.BaseData;
import com.company.object.Proc;

import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import java.util.List;

public class TableModel extends AbstractTableModel {



    List<Proc> proc;

    {
        try {
            proc = BaseData.getAllProc();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public int getRowCount() {
        return proc.size();
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
                return "Процессор";
            case 2:
                return "Фирма";
            case 3:
                return "Цена";
        }
        return "";
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { // берутся значения
        Proc bean = proc.get(rowIndex);
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





  /**  public void add() {
        proc.add(new Proc);
        fireTableRowsInserted(proc.size() - 1, proc.size() - 1);
    }
   **/

}


