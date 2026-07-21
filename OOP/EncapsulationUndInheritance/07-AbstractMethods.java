class Main {  
	static class Toyota extends Car {
        public Toyota() {
            super();
        }
        public void soundHorn() {
            System.out.println("sounds like a toyota");
        }
    }

    static class Mercedes extends Car {  
        public void soundHorn() {
            System.out.println("sounds like a mercedes");
        }
        public Mercedes() {
            super();
        }  
    }
    
    public static void main(String[] args) {
        Toyota myToyota = new Toyota();
        Mercedes myMercedes = new Mercedes();
        
        myToyota.soundHorn();
        myMercedes.soundHorn();
    }
    
}