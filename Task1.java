public class Task1 {

    // For 2 electronics item
    public double electronics() {
        double electric_item1 = 400;
        double electric_item2 = 500;
        double item1_gst = electric_item1 * (18.0 / 100);
        double item2_gst = electric_item2 * (18.0 / 100);
        // Total for electrionics with 18 % GST
        double electric_total_gst = item1_gst + item2_gst;
        System.out.println("2 Electric item value before GST applied= "+(electric_item1+electric_item2));
        System.out.println("2 Electric item value after GST applied= "+(electric_total_gst+electric_item1+electric_item2)+"\n");
        return (electric_total_gst+electric_item1+electric_item2);
    }

    public double fashion() {
        double fashion_item1=300;
        double fashion_item2=350;
        double fashion1_gst=fashion_item1*(13.0/100);
        double fashion2_gst=fashion_item2*(13.0/100);
        
        //Total for fashion item with 13% GST
        double fashion_total_gst=fashion1_gst+fashion2_gst;
        System.out.println("2 Fashion items total value before GST applied= "+(fashion_item1+fashion_item2));
        System.out.println("2 Fashion items total value after  GST applied= "+(fashion_total_gst+fashion_item1+fashion_item2)+"\n");

        return (fashion_total_gst+fashion_item1+fashion_item2);
    }


    public double food()
    {
        double food_item1=100;
        double food_total_gst=food_item1*(7.0/100);

        //Total for food item with 7% GST
        System.out.println("1 Food iteam total value before GST applied= "+food_item1);
        System.out.println("1 Food iteam total value after GST applied= "+(food_total_gst+food_item1)+"\n");

        return (food_total_gst+food_item1);
    }


    
public static void main(String args[]) {
    Task1 t = new Task1();

    double electric_bill = t.electronics();
    double fashion_bill = t.fashion();
    double food_bill = t.food();

    double total_bill = electric_bill + fashion_bill + food_bill;

    System.out.println("Total items value after GST = " + total_bill);

    double discount = (total_bill * 20) / 100;
    double total = total_bill - discount;

    // After applying 20% discount
    System.out.println("Applying 20% discount on " + total_bill
            + " we get = " + total);
}

}