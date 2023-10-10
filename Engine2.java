package prechec;

class Engine {
    String Enginematerial;
    double Uniqueid;
    int cost;

    public Engine(String Enginematerial, double Uniqueid, int cost) {
        this.Enginematerial = Enginematerial;
        this.Uniqueid = Uniqueid;
        this.cost = cost;
    }

    public String getEnginematerial() {
        return Enginematerial;
    }

    public double getUniqueid() {
        return Uniqueid;
    }

    public int getcost() {
        return cost;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

class HybridEngine extends Engine {
    public HybridEngine(String Enginematerial, double Uniqueid, int cost) {
        super(Enginematerial, Uniqueid, cost);
    }
}

 class Manufacture {
    private String Manufacturename;
    private int yearOfManufacture;

    public Manufacture(String Manufacturename, int yearOfManufacture) {
        this.Manufacturename = Manufacturename;
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getManufacturename() {
        return Manufacturename;
    }

    public int getyearOfManufacture() {
        return yearOfManufacture;
    }
}

abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }

    public abstract void ShowCharacteristics();
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Internal Combustion Engine Vehicle (ICEV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Battery Electric Vehicle (BEV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    public void ShowCharacteristics() {
        System.out.println("Hybrid Vehicle (HybridV)");
        System.out.println("Manufacture Name: " + getManufacture().getManufacturename());
        System.out.println("Year Of Manufacture: " + getManufacture().getyearOfManufacture());
        System.out.println("Engine Material: " + getEngine().getEnginematerial());
        System.out.println("Engine Unique ID : " + getEngine().getUniqueid());
        System.out.println("Engine Cost: " + getEngine().getcost());
    }
}

public class Engine2 {
    public static void main(String[] args) {
        Manufacture tata = new Manufacture("Tata", 2005);
        Manufacture bmw = new Manufacture("BMW", 2024);
        Manufacture audi = new Manufacture("Audi", 2020);
        Manufacture toyota = new Manufacture("Toyota", 2016);

        Engine iceEngine = new Engine("Steel", 12345.0, 23450);
        Engine electricEngine = new Engine("Copper",2321, 12375);
        Engine manualEngine = new Engine("Zinc", 2321.0, 123789);

        ICEV icev = new ICEV(tata, iceEngine);
        BEV bev = new BEV(tata, electricEngine);
        HybridV hybridv = new HybridV(tata, manualEngine);
        
        ICEV icev1 = new ICEV(bmw, iceEngine);
        BEV bev1 = new BEV(bmw, electricEngine);
        HybridV hybridv1 = new HybridV(bmw, manualEngine);
        
        ICEV icev2 = new ICEV(bmw, iceEngine);
        BEV bev2 = new BEV(bmw, electricEngine);
        HybridV hybridv2 = new HybridV(bmw, manualEngine);
        
        ICEV icev3 = new ICEV(bmw, iceEngine);
        BEV bev3 = new BEV(bmw, electricEngine);
        HybridV hybridv3 = new HybridV(bmw, manualEngine);
        
        

        Vehicle[] vehicles = { icev, bev, hybridv,icev1, bev1, hybridv1,icev2, bev2, hybridv2,icev3, bev3, hybridv3};

        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}
