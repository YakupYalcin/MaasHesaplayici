public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
//maaşa uygulanan vergiyi hesaplama
     double tax(){
        if (this.salary<1000){
            return 0;
        }else {
            return salary*0.03;
        }

    }
    double bonus(){
        if (this.workHours>40){
            int extraHours=workHours-40;
            return extraHours*30;

        }else {
            return 0;
        }
    }
    double hireYearBonus(){
        int yearsworked=2021-this.hireYear;
        if (yearsworked<10){
            return this.salary*1.05-this.salary;
        } else if (yearsworked<20) {
            return this.salary*1.1-this.salary;
        }else {
            return this.salary*1.15-this.salary;
        }
    }


    public void toPrint(){
        double currentSalary;
        currentSalary=bonus()+hireYearBonus()+this.salary-tax();
        System.out.println("Çalışan Adı: " + this.name + "" );
        System.out.println("Maaş: " + this.salary + " " + "TL" );
        System.out.println("Haftalık Çalışma Saati: " + this.workHours + "");
        System.out.println("Çalışma Süresi Bonusu: " +hireYearBonus()+" "+ "TL" +  "" );
        System.out.println("Vergi: " + tax() + " " + "TL"+"" );
        System.out.println("Bonus: " + bonus() +" "+ "TL"+ "");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+" "+(this.salary+bonus()-tax())+" " +"TLS");
        System.out.println("Yeni Yapılan Zamdan Sonra Bonussuz Brüt Maaş :"+(hireYearBonus()+this.salary)+" "+ "TL");
        System.out.println("Bu Ay Zamlı ve Bonuslu Maaş : "+" "+currentSalary+" "+"TL");

    }


}
