public class Printer {

    private int tonerLevel = 100;
    private int pagesPrinted;
    private boolean duplex = true;

    public Printer(int tonerLevel, boolean duplex) {

        this.pagesPrinted = 0;
        this.tonerLevel = (tonerLevel<0 || tonerLevel>100) ? -1 : tonerLevel;
        this.duplex = duplex;
    }

    public int addToner(int tonerAmount){

        int tempAmount = tonerLevel + tonerAmount;
        return ((tempAmount>100 || tempAmount<0) ? -1 : tempAmount);
    }
    public int printPages(int pages){

        int jobPages = (duplex) ? (pages/2)+(pages%2) : pages;
        this.pagesPrinted += jobPages;
        return (jobPages);
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
