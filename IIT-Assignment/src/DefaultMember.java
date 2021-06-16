public class DefaultMember {

    private String MembershipNumber;
    private String Name;
    private Date StartMembershipDate;

    public DefaultMember(String membershipNumber, String name, Date startMembershipDate) {
        MembershipNumber = membershipNumber;
        Name = name;
        StartMembershipDate = startMembershipDate;
    }

    public String getMembershipNumber() {
        return MembershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        MembershipNumber = membershipNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Date getStartMembershipDate() {
        return StartMembershipDate;
    }

    public void setStartMembershipDate(Date startMembershipDate) {
        StartMembershipDate = startMembershipDate;
    }
}
