class product {
    String pcode, name;
    double cost;

   
    product(String pc, String n, double p) {
        pcode = pc;
        name = n;
        cost = p;
    }

    static product findMinCost(product p1, product p2, product p3) {
        if (p1.cost < p2.cost && p1.cost < p3.cost) {
            return p1;
        } else if (p2.cost < p3.cost) {
            return p2;
        } else {
            return p3;
        }
    }

   
    void show() {
        System.out.println("PNO: " + pcode + ", PName: " + name + ", PCost: " + cost);
    }

    public static void main(String[] args) {
        product prod1 = new product("P01", "Keyboard", 1500);
        product prod2 = new product("P02", "Mouse", 800);
        product prod3 = new product("P03", "Monitor", 7000);

        System.out.println("Product List:");
        prod1.show();
        prod2.show();
        prod3.show();

        product cheapest = findMinCost(prod1, prod2, prod3);

        System.out.println("\nProduct with the lowest cost:");
        cheapest.show();
    }
}
