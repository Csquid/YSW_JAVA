package Chap14_Inheritance;

class Man {
    private String name;

    Man(String nName) {
        this.name = nName;
    }

    protected void tellYourName() {
        System.out.println("My Name is " + this.name);
    }
}

class BusinessMan extends Man {
    private String company;
    private String position;

    BusinessMan(String nName) {
        super(nName);
        this.company = null;
        this.position = null;
    }
    BusinessMan(String nName, String nCompany) {
        super(nName);
        this.company = nCompany;
    }
    BusinessMan(String nName, String nCompany, String nPosition) {
        super(nName);
        this.company = nCompany;
        this.position = nPosition;
    }

    protected void tellYourInfo() {
        super.tellYourName();       //Man Class Method
        System.out.println("My Company is " + this.company);
        System.out.println("My Position is " + this.position);
    }
}

public class A01_Man {
    public static void main(String[] args) {
        BusinessMan human01 = new BusinessMan("jjy", "Apple", "Manager");
        human01.tellYourInfo();
    }
}
