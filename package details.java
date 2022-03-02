public class PackageDetails {
    public String PackageName;
    public int NoOfClothes;
    public int SubFee;
    public int Validity;
    PackageDetails(String pname, int clo, int fee, int val) {
        this.PackageName = pname;
        this.NoOfClothes = clo;
        this.SubFee = fee;
        this.Validity = val;
    }


    public String getPackageName() {
        return PackageName;
    }

    public int getValidity() {
        return Validity;
    }
    public void setValidity(int val) {
        Validity = val;
    }

    public int getNoOfClothes() {
        return NoOfClothes;
    }

    public void setNoOfClothes(int clo) {
        NoOfClothes = clo;
    }

    public int getSubFee() {
        return SubFee;
    }

    public void setSubFee(int fee) {
        SubFee = fee;
    }

    public void PackageDisplayinfo() {
        System.out.println("LaundryPackage Name:" + PackageName + " ||NoOfClothes: " + NoOfClothes + " ||SubscriptionFee: " + SubFee + " ||Validity Days " + Validity);
        System.out.println("-----------------------------------------------------------------------");
    }
}
