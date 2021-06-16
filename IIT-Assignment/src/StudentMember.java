public class StudentMember extends DefaultMember{

    private String SchoolName;

    public StudentMember(String membershipNumber, String name, Date startMembershipDate,String SchoolName) {
        super(membershipNumber, name, startMembershipDate);
        this.SchoolName = SchoolName;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }
}
