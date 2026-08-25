package 06-Introduction to Testing in Java.02_Testing with Dependencies;

class Main {
    public static void main(String[] args) {
        launchMockitoTestsAndPrint(ExchangeAppTest.class);
    }
}

class 03_ExchangeAppTest {
    @Test
    void convertEuroTo_convertsTST() {
        // Create a mock object for the EuropeanCentralBankServer
        EuropeanCentralBankServer bank = mock(EuropeanCentralBankServer.class);
        ExchangeApp exchangeApp = new ExchangeApp(bank);
        double euroAmount = 100;
        // Stub the mock to return a value for given input
        when(exchangeApp.convertEuroTo("TST", 100)).thenReturn(12345.0);

        double tstAmount = exchangeApp.convertEuroTo("TST", euroAmount);

        System.out.println("Converted " + euroAmount + " EUR to " + tstAmount + " TST.");
        // Assert on the exact expected value of tstAmount
        assertEquals(1234500, tstAmount);
    }
}