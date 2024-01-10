package week1;

public class PayRoll {
    float payRate;
    float workhours;
    PayRoll(float pr, float wh) // 2 argument constructor
    {
        payRate = pr;
        workhours = wh;
    }
    public float[] displayGrossPayandNetPay() // change return type void to float
    {
        float[] pays = new float[2];
        //float grossPay = payRate * workhours;
        //float netPay = grossPay - (grossPay * 0.15f);
        pays[0] = payRate * workhours;
        pays[1] = pays[0] - (pays[0] * 0.15f);
        //System.out.printf("Gross Pay is %20.2f \n net pay is %20.2f ",grossPay,netPay);
        //return "method finished"; // add return statement
        return pays;
    }

    public static void main(String[] args) {
        PayRoll payroll = new PayRoll(20,8);// create payroll object
        //String gpay = payroll.displayGrossPayandNetPay();
        float[] pays = payroll.displayGrossPayandNetPay();
        //System.out.println("return value grosspay in main "+gpay);
        System.out.printf("Gross Pay is %10.2f \nNet pay is %10.2f ",pays[0],pays[1]);

    }
}
