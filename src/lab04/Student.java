package lab04;

public class Student extends Person {
    private long uniRollNumber;
    private double currentCPI;
    public long getUniRollNumber() {
        return uniRollNumber;
    }

    public void setUniRollNumber(long uniRollNumber) {
        this.uniRollNumber = uniRollNumber;
    }

    public double getCurrentCPI() {
        return currentCPI;
    }

    public void setCurrentCPI(double currentCPI) {
        this.currentCPI = currentCPI;

    }


    public Student(String name, int age, char gender, long uniRollNumber, double currentCPI) {
        super(name, age, gender);
        setUniRollNumber(uniRollNumber);
        setCurrentCPI(currentCPI);

    }

    @Override
    public String toString() {
        StringBuilder response = new StringBuilder();
        response.append(super.toString());
        response.append("my university roll no is " + getUniRollNumber() + " and my current CPI is " + getCurrentCPI());
        return response.toString();
    }

}
