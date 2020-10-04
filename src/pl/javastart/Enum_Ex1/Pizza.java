package pl.javastart.Enum_Ex1;

public enum Pizza {
    MARGHERITA(true, true, false, false, "Margherita"),
    CAPRICIOSA(true, true, true, false, "Capriciosa"),
    PROSCIUTTO(true, true, false, true, "Prosciutto");

    private boolean sauce, cheese, mushrooms, ham;
    String name;

    public String getName() {
        return name;
    }

    Pizza(boolean sauce, boolean cheese, boolean mushrooms, boolean ham, String name) {
        this.sauce = sauce;
        this.cheese = cheese;
        this.mushrooms = mushrooms;
        this.ham = ham;
        this.name = name;
    }

    public static Pizza fromDescription(String description)
    {
        Pizza[] pizzas = values();
        for(Pizza pizza : pizzas)
        {
            if(pizza.getName().equals(description))
                return pizza;
        }
        return null;
    }

    @Override
    public String toString() {
        String result = name + " has ";

        if(sauce)
            result += "tomato sauce; ";
        if(cheese)
            result += "cheese; ";
        if(mushrooms)
            result += "mushrooms; ";
        if(ham)
            result += "ham; ";
        return result;
    }
}
