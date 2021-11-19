package FinalAssingtment_KietNV;
import org.jetbrains.annotations.Contract;

public class BeautySalon {
        private static double serviceDiscountPremium = 0.2;
        private static double serviceDiscountGold = 0.15;
        private static double serviceDiscountSilver = 0.1;
        private static double productDiscountPremium = 0.1;
        private static double productDiscountGold = 0.1;
        private static double productDiscountSilver = 0.1;

        public static double getServiceDiscountRate(String type) {
            return Int(type, serviceDiscountPremium, serviceDiscountGold, serviceDiscountSilver);
        }

    public static double Int(String type, double serviceDiscountPremium, double serviceDiscountGold, double serviceDiscountSilver) {
        switch (type) {
            case "Premium":
                return serviceDiscountPremium;
            case "Gold":
                return serviceDiscountGold;
            case "Silver":
                return serviceDiscountSilver;
            default:
                throw new IllegalArgumentException("wrong service type specified");
        }
    }
    @Contract(pure = true)
        public static double getProductDiscountRate(String type) {
        return Int(type, productDiscountPremium, productDiscountGold, productDiscountSilver);
    }
    }


