class School1
{
    private String schoolName;

    private String schoolAddress;

    private String principal;

    private int noOfStudents;
    
    School1(String schoolName,String schoolAddress,String principal, int noOfStudents)
    {
      this.schoolName=schoolName;
      this.schoolAddress=schoolAddress;
      this.principal=principal;
      this.noOfStudents=noOfStudents;
    }
    public String getSchoolName()
    {
        return schoolName;
    }
    public String getSchoolAddress()
    {
        return schoolAddress;
    }
    public String getPrincipal()
    {
        return principal;
    }
    public void setPrincipal(String principal)
    {
        this.principal=principal;
    }
    public int getNoOfStudents()
    {
        return noOfStudents;
    }
    public void setNoOfStudents(int noOfStudents)
    {
        this.noOfStudents=noOfStudents;
    }
}