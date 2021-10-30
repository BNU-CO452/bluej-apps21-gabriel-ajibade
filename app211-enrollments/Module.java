public class Module
{
    private String code, title;
    private int credit;

    public Module(String code, String title)
    {
        this.code = code;
        this.title = title;
        // initialise instance variables
    }

    public String getCode() {
        return code;
    }
    
    public String getTitle() {
        return title;
    }
    
    public int getCredit() {
        return credit;
    }
    public void setCredit(int a){
        credit = a;   
    }
    public void print() {
        System.out.println(" --------------------------------\nApp211: Module Details\n--------------------------------");
        System.out.println("Module Code: " + code + ": " + title + ": " + credit);
    }
}
