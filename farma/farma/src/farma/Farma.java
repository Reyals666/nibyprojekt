import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;  // losowosci
class Plant{
    String name; // nazwa rosliny
    double cost, production_cost;  // koszt przygotowania ziemi  , koszty produkcji 
    int productivity; //ile ton z hektara
    int age;   // wiek rosliny
    int time_period;  // czas do zbiorów
    String plant_period; // kiedy można ja sadzic
    double harvest_cost; // koszt zbiorów
    double price; // cena za kg
    
    public Plant (String name, double cost, double production_cost, int productivity, int age, int time_period, String plant_period, double harvest_cost,
                  double price){
        this.name = name;
        this.cost = cost;
        this.production_cost = production_cost;
        this.productivity = productivity;
        this.age = age;
        this.time_period = time_period;
        this.plant_period = plant_period;
        this.harvest_cost = harvest_cost;
        this.price = price;
    }
          public String get_name (){ return  name;}
    public void set_name( String name ){ this.name = name;}

    public double get_cost (){return cost;}
    public void set_cost (double cost){this.cost = cost;}

    public double get_Production_cost (){return production_cost;}
    public void set_Production_cost (double production_cost){this.production_cost = cost;}

    public int get_productivity(){return productivity;}
    public void set_productivity (int productivity) {this.productivity = productivity;}

    public int get_age(){return age;}
    public void set_age (int age) {this.age = age;}

    public int get_time_period (){return time_period;}
    public void set_time_period (int time_period){this.time_period = time_period;}

    public String get_plant_period() {return plant_period;}
    public void set_plant_period (String plant_period){this.plant_period = plant_period;}

    public double get_harvest_cost() {return harvest_cost;}
    public void set_harvest_cost(double harvest_cost){this.harvest_cost = harvest_cost;}

    public double get_price() {return price;}
    public void set_price (double price){this.price = price;}


    class Animal{
    String name; 
    int age; // ile tygodnio
    boolean if_eggs, if_milk;  // czy znosi jajka czy daje mleko
    double cost;  //koszt zwierzęcia
    double wage, wageplus; // ile wazy ile tyje
    int mature; // duze czy małe
    boolean height;
    boolean reproduction;
    double food;
    String type_food;
    //String[] type_food;  // jakie typu jedzenie zwierze akceptuje
    int reporductionchance; // szansa na rozmnozenie musze posiadac wiecej niz 1 zwierze

    public Animal( String name, int age, int lifeperiod, boolean if_eggs, boolean if_milk, double cost, double wage, double wageplus, int mature,
                   boolean height, boolean reproduction, double food, String type_food, int reporductionchance ){
        this.name = name;
        this.age = age;
        this.if_eggs = if_eggs;
        this.if_milk = if_milk;
        this.cost = cost;
        this.wage = wage;
        this.wageplus = wageplus;
        this.mature = mature;
        this.height = height;
        this.reproduction = reproduction;
        this.food = food;
        this.type_food = type_food;
        this.reporductionchance = reporductionchance;
    }
    public String get_name(){ return name; }
    public void set_name (String name){this.name = name;}

    public int get_age () {return age;}
    public void set_age ( int age ){this.age = age;}

    public boolean get_if_eggs (){return if_eggs;}
    public void set_if_eggs (boolean if_eggs){this.if_eggs = if_eggs;}

    public boolean get_if_milk (){return if_milk;}
    public void set_if_milk (boolean if_eggs){this.if_milk = if_milk;}

    public double get_cost (){return cost;}
    public void set_cost ( double cost) {this.cost = cost;}

    public double get_wage (){return wage;}
    public void set_wage (double wage){ this.wage = wage;}

    public double get_wageplus (){return  wageplus;}
    public void set_wageplus (double wageplus){ this.wageplus = wageplus;}

    public int get_mature (){return mature;}
    public void set_mature ( int mature ){ this.mature = mature;}

    public boolean get_height (){return height;}
    public void set_height (boolean height){ this.height = height;}

    public boolean get_reproduction (){return reproduction;}
    public void set_reproduction ( boolean reproduction){ this.reproduction = reproduction;}

    public double get_food (){return food;}
    public void set_food ( double food ){ this.food = food;}

    public String get_type_food (){return type_food;}
    public void set_type_food ( String type_food ){ this.type_food = type_food;}

    public int get_reproductionchance(){return reporductionchance;}
    public void set_reproductionchance (int reporductionchance){ this.reporductionchance = reporductionchance;}
    class Player{
    String name;
    double money;
    double acres;
    int food;

    public Player (String name ,double money, int acres,int food ){
        this.name = name;
        this.money = money;
        this.acres = acres;
        this.food = food;
    }

    public Player(){
        money = 10000;
        acres = 0;
        food = 0;
    }
    public String get_name(){return name;}
    public void set_name(String name){this.name = name;}
    public int get_food(){return food;}
    public void set_food (int food){this.food += food;}
    public double get_money(){return money;}
    public void set_money (double money){this.money = money;}
    public double get_acres (){return acres;}
    public void set_acres( double amount ){acres += amount;}
    public void changemoney( double money ){this.money -= money;}
    public void addmoney( double money ){this.money += money;}
}
class Farm {
    double size;
    int buildings_amount;
    public ArrayList <Building> buildings_farm = new ArrayList<Building>();
    double cost;

    public Farm(int size, int buildings_amount, double cost) {
        this.size = size;
        this.buildings_amount = buildings_amount;
        this.cost = cost;
    }

    public void show(){
        System.out.println("Size of Farm: " + size + " buildings_amount: " + buildings_amount);
    }

    public void set_size(double size){ this.size = size; }
    public double get_size(){ return size; }

    public void set_buildings_amount(int buildings_amount){ this.buildings_amount = buildings_amount; }
    public int get_buildings_amount(){ return buildings_amount; }

    public void set_cost(double cost){ this.cost = cost; }
    public double get_cost(){ return cost; }

    public void addFarm( Building a ){
        buildings_farm.add(a);
    }
    }
class Building {
     double surface;
    double price;
    String name;
    public Building (String name, double surface, double price){
        this.name = name;
        this.surface = surface;
        this.price = price;
}
    }
String pora_roku;
            if (turn % 96 <= 24)
                pora_roku = "wiosna";
            else if (turn % 96 <= 48)
                pora_roku = "lato";
            else if (turn % 96 <= 72)
                pora_roku = "jesien";
            else
                pora_roku = "zima";

    
    }
    if (g.money <= 0) {
                zero_money(g);
                int random = generator.nextInt(100);
                if (random > 50 && random < 60) {
                    ;
    }}
 System.out.println("Aktualny tydzien " + week / 2);
}