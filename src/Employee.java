public class Employee {

    // Degiskenler tanimlandi.
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;



    //Kurucu fonksiyon tanimlanmasi
    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    // Vergi hesaplanmasi
    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    //Bonus hesaplanmasi
    public double bonus() {
        if (workHours > 40) {
            return (workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    //Maas artisi hesaplama
    public double raiseSalary() {
        double raiseSeniority=1;
        int yearsWorked = 2021 - hireYear;
        if (yearsWorked < 10) {
            raiseSeniority = 0.05;
        } else if (yearsWorked >= 10 && yearsWorked < 20) {
            raiseSeniority = 0.1;
        } else if (yearsWorked >= 20) {
            raiseSeniority = 0.15;
        }

        double raiseAmount = salary * raiseSeniority;

        return raiseAmount;
    }

    //Bilgilerin ekrana yazdirilmasi
    @Override
    public String toString() {
        double raiseAmount = raiseSalary();
        double totalSalaryWithout = salary + bonus() - tax();
        double totalSalary = salary + raiseAmount+ bonus() - tax(); //Zamlı maas
        return "Adı : " + name + "\n" +
                "Maaşı : " + salary + "\n" +
                "Çalışma Saati : " + workHours + "\n" +
                "Başlangıç Yılı : " + hireYear + "\n" +
                "Vergi : " + tax() + "\n" +
                "Bonus : " + bonus() + "\n" +
                "Maaş Artışı : " + raiseSalary() + "\n" +
                "Vergi ve Bonuslar ile birlikte maaş : " + totalSalaryWithout + "\n" +
                "Toplam Maaş : " + (totalSalary);
    }


}
