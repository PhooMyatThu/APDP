package week1;

public class PayRoll {
    float payRate;
    float workhours;
    PayRoll(float pr, float wh) // 2 argument constructor
    {
        payRate = pr;
        workhours = wh;
    }
    public void displayGrossPayandNetPay()
    {
        float grossPay = payRate * workhours;
        float netPay = grossPay - (grossPay * 0.15f);
        System.out.printf("Gross Pay is %20.2f \n net pay is %20.2f ",grossPay,netPay);
    }

    public static void main(String[] args) {
        PayRoll payroll = new PayRoll(20,8);// create payroll object
        payroll.displayGrossPayandNetPay();
    }
}
