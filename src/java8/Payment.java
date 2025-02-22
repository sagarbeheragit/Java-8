package java8;

public interface Payment {
    public default void addCoupon(){
        System.out.println(" Adding Coupon...");
    }
}
