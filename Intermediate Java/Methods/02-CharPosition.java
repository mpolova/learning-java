 class SecurityChecker {
    public static void main(String[] args) {
        String url = "https://www.usa.gov/holidays";

        // Enter the right position to retrieve the 's' of the above url
        int charPosition = 4;

        System.out.println("s means secure : ");
        // Enter the correct method on url to find the security character
        System.out.println(url.charAt(charPosition));
    
    }
    
}
