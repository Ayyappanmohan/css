class facebook {

    double version;
    String founder;
    User u;

    facebook(double version,String founder,User u)
    {
        this.founder=founder;
        this.version=version;
        this.u=u;
    }

    public void facedetails()
    {
        System.out.println(version);
        System.out.println(founder);
        System.out.println(u.username);
        System.out.println(u.password);

    }

    
}