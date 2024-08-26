/*
 * Enum is a class. 
 * We  can't extend enum with any other class
 */

enum Status{
    Running, Failed, Pending, Success; 
}

enum LaptopEnum{
    Macbook(2000), XPS(), Surface(1500), Thinkpad(1800);

    private int price;

    private LaptopEnum(){
        price = 500;
    }

    private LaptopEnum(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
}


class Enumeration {
    public static void main(String args[]){
        Status[] ss = Status.values();

        for(Status s: ss){
            if(s==Status.Running){
                System.out.println("All good!");
            }
            else if(s==Status.Failed){
                System.out.println("Try again!");
            }
            else if(s==Status.Pending){
                System.out.println("Please wait...");
            }
            else{
                System.out.println("Done!");
            }
        }

        for(LaptopEnum lap: LaptopEnum.values()){
            System.out.println(lap + " : " + lap.getPrice());
        }


    }
}
