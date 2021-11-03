/**
 * Main class to test Factory pattern
 */
 
public class ToasterMain {
        public static void main(String[] args) {
                // create an instance of ToasterIndustry
                ToasterIndustry toasterIndustry = new ToasterIndustry();
                // Create an object for RegularToaster and call the print method
                Toaster rToaster = toasterIndustry.getToasterSlot("regular");
                // call the method of RegularToaster
                rToaster.printToaster();
                // Create an object for WideToaster and call the print method
                Toaster wToaster = toasterIndustry.getToasterSlot("wide");
                // call the method of WideToaster
                wToaster.printToaster();

        }
}