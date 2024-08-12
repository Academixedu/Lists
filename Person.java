public class Person {
    private int pid;
    private String pname;
    private double psal;
    private String pdesg;
  

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public double getPsal() {
        return psal;
    }

    public void setPsal(double psal) {
        this.psal = psal;
    }

    public String getPdesg() {
        return pdesg;
    }

    public void setPdesg(String pdesg) {
        this.pdesg = pdesg;
    }

   


    public Person(int pid, String pname, double psal, String pdesg) {
        this.pid = pid;
        this.pname = pname;
        this.psal = psal;
        this.pdesg = pdesg;
    }

    
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", psal=" + psal + ", pdesg=" + pdesg + "]";
    }

    public Person() {
    }

    


    
    
    
}

