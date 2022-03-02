import java.util.*;
class Laundry {

    public static void main(String[] args) {
        int total=0;
        List <PackageDetails> pack = new ArrayList<>();
        List <PackageBooking> bookings = new ArrayList<>();
        pack.add(new PackageDetails("GoldPackage",2,20,30));
        pack.add(new PackageDetails("SilverPackage",4,10,45));
        pack.add(new PackageDetails("PlatinumPackage",4,15,10));
        int useropt = 1;
        Scanner sc = new Scanner(System.in);
        for (PackageDetails b : pack) {
            b.PackageDisplayinfo();
        }
        while (useropt == 1) {
            System.out.println("Press 1 for Booking \nPress 2 to exit");
            useropt = sc.nextInt();
            if(useropt == 1) {
                PackageBooking book = new PackageBooking();
                for(PackageDetails d : pack){
                    if( d.getPackageName().contains(book.pname)){
                        if(d.getNoOfClothes()!=0){

                            int a= d.getNoOfClothes();
                            int b=d.getSubFee();
                            bookings.add(book);
                            d.setNoOfClothes(--a);
                            total+=b;
                            System.out.println("Booking is Confirmed, Thanks for booking\n");
                            System.out.println("Fee Rs."+d.SubFee);
                            System.out.println("Your Validity " +d.Validity);
                            System.out.println("Laundry Package Name "+d.PackageName+" Balance Clothes is "+d.getNoOfClothes());
                            System.out.println("Total Amount RS."+total);
                        }else{
                            System.out.println("Sorry Laundry is Full,Try Another Laundry ");
                        }

                    }
                    //something here
                }


            }
            if(useropt > 2 ){
                System.out.println("Invalid No");
            }

        }
    }
}
