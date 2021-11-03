/**
 * Factory class 
 */
 
public class ToasterIndustry {
        /**
         * 
         * @param slotType
         * @return object based on the type
         */
        public Toaster getToasterSlot(String slotType) {
                // check the type of the toaster slot, create a object of that type and return
                // it
                if (slotType.equalsIgnoreCase("Regular")) {
                        return new RegularSlotToaster();
                } else if (slotType.equalsIgnoreCase("Wide")) {
                        return new WideSlotToaster();
                } else {
                        return null;
                }
        }
}