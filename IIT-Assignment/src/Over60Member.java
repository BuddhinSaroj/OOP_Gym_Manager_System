public class Over60Member extends DefaultMember{

    private int Age;

    public Over60Member(String MembershipNumber,String Name,Date StartMembershipDate,int age) {
       super(MembershipNumber,Name,StartMembershipDate);
       this.Age = age;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }
}
