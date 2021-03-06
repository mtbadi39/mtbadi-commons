package com.mtbadi39.commons.table;

import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class BooleanRenderer extends DefaultTableCellRenderer implements TableCellRenderer {

    private static final long serialVersionUID = 1L;

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
            boolean isSelected, boolean hasFocus, int row, int column) {
        Boolean b;
        if (value instanceof Boolean) {
            setHorizontalAlignment(SwingConstants.CENTER);
            setHorizontalTextPosition(SwingConstants.CENTER);
            b = (Boolean) value;
            if (b == true) {
                setIcon(new ImageIcon(getClass().getResource("/images/table/state_ok.png")));
            } else if (b == false) {
                setIcon(new ImageIcon(getClass().getResource("/images/table/state_no.png")));
            } else {
                setIcon(null);
            }
        } else {
            super.setValue(value);
        }
        if (isSelected) {
            setBackground(UIManager.getColor("Table.selectionBackground"));
            setForeground(UIManager.getColor("Table.selectionForeground"));
        } else {
            setBackground(UIManager.getColor("Table.background"));
            setForeground(UIManager.getColor("Table.foreground"));
        }
        setFont(table.getFont());
        return this;
    }
}
