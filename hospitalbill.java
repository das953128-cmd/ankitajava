import java.util.scanner;
Class hospitalbill{
    private int patientid;
    private string patientname;
    private int age;
    private string disease;
    private double consultationfees;
    public void inputDetails()
    {
        Scanner sc = new Scanner(System.in)
        System.out.print("enter patient id:");
        patientid = sc.nextlnt();
        sc.nextLine();

        system.out.print("enter patient name:");
        patientname = sc.nextlnt();

        system.out.print("enter age:");
        age = sc.nextlnt();
        sc.nextLine();

        system.out.print("enter disease:");
        disease = sc.nextLine();

        

    }

}