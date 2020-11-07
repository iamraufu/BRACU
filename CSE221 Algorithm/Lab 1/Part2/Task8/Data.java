public class Data
{
    
    int month;
    int day;
    int year;
    
    public Data(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    public int getMonth()
    {
        return month;
    }
    
    public void setMonth(int m)
    {
        month = m;
    }
    
    public int getDay()
    {
        return day;
    }
    
    public void setDay(int d)
    {
        day = d;
    }
    
    public int getYear()
    {
        return year;
    }
    
    public void setYear(int y)
    {
        year = y;
    }
    
    public String displayDate()
    {
        return month+"/"+day+"/"+year;
    }
}