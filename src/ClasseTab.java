import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class ClasseTab {
        @TabelaTeste(valor = "X", num = 10)

        public static void main(String[] args) {
            JFrame frame = new JFrame("Exemplo de Tabela");

            frame.setSize(400, 300);

            String[][] data = {
                    {"1", "Nome 1", "Sobrenome 1"},
                    {"2", "Nome 2", "Sobrenome 2"},
                    {"3", "Nome 3", "Sobrenome 3"}
            };

            String[] columnNames = {"ID", "Nome", "Sobrenome"};

            DefaultTableModel tableModel = new DefaultTableModel(data, columnNames);

            JTable table = new JTable(tableModel);

            JScrollPane scrollPane = new JScrollPane(table);

            frame.add(scrollPane, BorderLayout.CENTER);

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            frame.setVisible(true);
        }

    }
