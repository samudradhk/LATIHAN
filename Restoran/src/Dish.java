public class Dish {
    private String id;
    private String menu;
    Chef chef;

    Dish(String menu, String id,Chef chef){
        this.id = id;
        this.menu = menu;
        this.chef = chef;
        System.out.println("Dish added to menu: " +menu);
    }

    String getId(){
        return id;
    }

    String getMenu(){
        return menu;
    }

    Chef getChef(){
        return chef;
    }

    public void printMenu(){
        System.out.println("Dish: "+menu);
        System.out.println("ID: "+id);
        System.out.println("Chef: "+chef.getName());
        System.out.println("Biography: "+chef.getBiography());
        System.out.println("-----------------------------------");
    }
    
}
