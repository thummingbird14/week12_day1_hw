public class Printer {
    private int sheets;

    public Printer(int sheets) {
        this.sheets = sheets;
    }

    public int getSheets() {
        return sheets;
    }

    public void setSheets(int sheets) {
        this.sheets = sheets;
    }

    public void print(int pages, int copies){
        int used = pages * copies;
        if (this.sheets >= used) {
            setSheets(this.sheets - used);
        }
    }
}
