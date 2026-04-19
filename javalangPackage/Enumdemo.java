package javalangPackage;

enum Dept {
    CS("john","Block A"), IT("smith","Block B"), ECE("srinivas","Block C"), CIVIL("Anshul","Block D"); // must be in Capital only
    String head;
    String location;
    private Dept(String head,String loc) {
        this.head=head;
        this.location=loc;
       // System.out.println(this.name());
    }
    public String getheadName()
    {
        return head;
    }
    public String getLocation()
    {
       return location;
    }
    public void display()
    {
        System.out.println(this.name()+" "+this.ordinal());
    }
}

public class Enumdemo {
    public static void main(String[] args) {
        Dept d = Dept.CS;
      //  d.display();
      System.out.println(d.getheadName());
      System.out.println(d.getLocation());
       /* System.out.println("index of CS :" + d.ordinal());
        System.out.println("name :" + d.name());

        System.out.println(Dept.valueOf("CIVIL"));

        Dept list[] = Dept.values();
        for (Dept x : list)
            System.out.print(x + " ");
        System.out.println(" ");*/

       /* switch (d) {
            case CS:
                System.out.println("Head: john \nBlock: A");
                break;
            case IT:
                System.out.println("Head: smith \nBlock: B");
                break;
            case ECE:
                System.out.println("Head: srinivas \nBlock: C");
                break;
            case CIVIL:
                System.out.println("Head: Anshul \nBlock: D");
                break;
        }   */
    }
}
