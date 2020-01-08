package View;

import Utils.StringBetter;

import java.util.List;

public class Table<T> implements ITable{
    private final List<String> lineLabels;
    private final List<String> columnLabels;
    private final List<List<T>> iT;
    private final StringBuilder builder;

    public Table(List<List<T>> iT, List<String> linLabel, List<String> colLabel) {
        this.lineLabels = linLabel;
        this.columnLabels = colLabel;
        this.iT = iT;
        this.builder = new StringBuilder();
    }

    private void printSeparatorLine(int[] sizeCols) {
        StringBetter sif = new StringBetter("-");
        for (int j = 0; j <= sizeCols.length - 1; j++) {
			this.builder.append("+").append(sif.repeat(sizeCols[j]));
		}
        this.builder.append("+\n");
    }


    @Override
    public String toString() {
        builder.setLength(0);
        int nColumns = this.columnLabels.size();
        int nLines = this.lineLabels.size();
        StringBetter spacing = new StringBetter(" ");

        int[] columnsWidths = calculateColumnsWidths(nColumns, nLines);
        printLabelRow(nColumns, spacing, columnsWidths);
        printContents(nColumns, nLines, spacing, columnsWidths);

        return builder.toString();
    }

    private void printContents(int col, int lin, StringBetter spacer, int[] sizeCols) {
        for (int i = 0; i < lin; i++) {
            builder.append("| ").append(this.lineLabels.get(i));
            builder.append(spacer.repeat(sizeCols[0] - this.lineLabels.get(i).length() - 1));
            for (int j = 0; j < col; j++) {
                builder.append("| ").append(this.iT.get(i).get(j));
                builder.append(spacer.repeat(sizeCols[j + 1] - this.iT.get(i).get(j).toString().length() - 1));
            }
            builder.append("|\n");
            this.printSeparatorLine(sizeCols);
        }
    }

    private void printLabelRow(int col, StringBetter spacer, int[] sizeCols) {
        this.printSeparatorLine(sizeCols);
        builder.append("|");
        builder.append(spacer.repeat(sizeCols[0]));
        for (int j = 0; j < col; j++) {
            builder.append("| ").append(this.columnLabels.get(j));
            builder.append(spacer.repeat(sizeCols[j + 1] - this.columnLabels.get(j).length() - 1));
        }
        builder.append("|\n");
        this.printSeparatorLine(sizeCols);
    }

    private int[] calculateColumnsWidths(int nColumns, int nLines) {
        int[] columnsWidths = new int[nColumns + 1];
        int maxLabelWidth = 0;
        for (String s : this.lineLabels) {
			maxLabelWidth = Math.max(maxLabelWidth, s.length());
		}
        columnsWidths[0] = maxLabelWidth + 2;
        for (int i = 0; i < nColumns; i++) {
            columnsWidths[i + 1] = this.columnLabels.get(i).length() + 2;
            for (int j = 0; j < nLines; j++) {
				columnsWidths[j + 1] = Math.max(columnsWidths[j + 1], this.iT.get(j).get(j).toString().length() + 2);
			}
        }
        return columnsWidths;
    }
}
