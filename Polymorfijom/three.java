class Pizza {
    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;

    public String getSize() {
        return size;
    }

    public int getCheeseToppings() {
        return cheeseToppings;
    }

    public int getPepperoniToppings() {
        return pepperoniToppings;
    }

    public int getHamToppings() {
        return hamToppings;
    }

    public void setSize(String size) {
        if (size.equals("small") || size.equals("medium") || size.equals("large")) {
            this.size = size;
        } else {
            System.out.println("Invalid size!");
        }
    }

    public void setCheeseToppings(int cheeseToppings) {
        this.cheeseToppings = cheeseToppings;
    }

    public void setPepperoniToppings(int pepperoniToppings) {
        this.pepperoniToppings = pepperoniToppings;
    }

    public void setHamToppings(int hamToppings) {
        this.hamToppings = hamToppings;
    }

    public Pizza(String size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        setSize(size);
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }

    // overloaded constructor
    public Pizza() {
        this("small", 0, 0, 0);
    }

    public double calcCost() {
        double cost = 0;
        switch (size) {
            case "small":
                cost = 10;
                break;
            case "medium":
                cost = 12;
                break;
            case "large":
                cost = 14;
                break;
        }
        cost += (cheeseToppings + pepperoniToppings + hamToppings) * 2;
        return cost;
    }

    public String getDescription() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", cheeseToppings=" + cheeseToppings +
                ", pepperoniToppings=" + pepperoniToppings +
                ", hamToppings=" + hamToppings +
                ", cost=" + calcCost() +
                '}';
    }

}

public class Three {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza("medium", 2, 2, 3);
        Pizza p3 = new Pizza("small", 3, 3, 4);
        p3.setSize("large");

        System.out.println(p1.getDescription());
        System.out.println(p2.getDescription());
        System.out.println(p3.getDescription());
    }
}
