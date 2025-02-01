class Park {
    private String name;
    private String location;

    public Park(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void printParkInfo() {
        System.out.println("Park: " + name);
        System.out.println("Location: " + location);
    }

    class Attraction {
        private String attractionName;
        private String workingHours;
        private double price;

        public Attraction(String attractionName, String workingHours, double price) {
            this.attractionName = attractionName;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Attraction: " + attractionName);
            System.out.println("Working Hours: " + workingHours);
            System.out.println("Price: " + price + " USD");
            System.out.println();
        }
    }
}

class Choose {
    public static void main(String[] args) {
        Park park = new Park("Wonderland", "New York");

        park.printParkInfo();

        Park.Attraction rollerCoaster = park.new Attraction("Roller Coaster", "10 AM - 8 PM", 5.0);
        Park.Attraction ferrisWheel = park.new Attraction("Ferris Wheel", "10 AM - 10 PM", 7.0);
        Park.Attraction hauntedHouse = park.new Attraction("Haunted House", "11 AM - 9 PM", 10.0);

        rollerCoaster.printAttractionInfo();
        ferrisWheel.printAttractionInfo();
        hauntedHouse.printAttractionInfo();
    }
}