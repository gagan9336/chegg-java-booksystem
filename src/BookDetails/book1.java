package BookDetails;

public class book1

{
    public int sNo;
    public String title;
    public String publisher;
    public int year;
    public int pages;

    public book1(int sNo, String title, String publisher, int year, int pages)

    {
        this.sNo = sNo;
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.pages = pages;
    }

    public void getsNo()

    {

        System.out.println("Serial Number of Book: " + sNo);

    }

    public void gettitle()

    {

        System.out.println("Title of Book: " + title);

    }

    public void getpublisher()

    {

        System.out.println("Publisher of Book: " + publisher);

    }

    public void getyear()

    {

        System.out.println("Year: " + year);

    }

    public void getpages()

    {

        System.out.println("Pages of Book: " + pages);

    }

    public void setsNo(int sNo)

    {

        this.sNo = sNo;

    }

    public void settitle(String title)

    {

        this.title = title;

    }

    public void setpublisher(String publisher)

    {

        this.publisher = publisher;

    }

    public void setYear(int year)

    {

        this.year = year;

    }

    public void setpages(int pages)

    {

        this.pages = pages;

    }

    public void show()

    {
        getsNo();
        gettitle();
        getpublisher();
        getyear();
        getpages();
    }

}