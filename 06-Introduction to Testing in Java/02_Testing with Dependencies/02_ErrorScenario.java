class 02_ErrorScenario {
    public static void main(String[] args) {
        launchTestsAndPrint(ExchangeAppTest.class);
    }
}

class ExchangeAppTest {
    @Test
    void convert_throwsException_whenGetRateThrowsException() {
        EuropeanCentralBankServer bank = new EuropeanCentralBankServer();
        ExchangeApp exchangeApp = new ExchangeApp(bank);
        Exception expectedException = null;

        try {
            double result = exchangeApp.convertEuroTo("Invalid Currency", 1000);
        } catch (Exception e) {
        	expectedException = e;
        }
       	// Assert that the exception is an instance of the correct class
        assertInstanceOf(RuntimeException.class, expectedException);
        // Assert that the exception message is correct
        assertEquals("Currency not in ECB list: Invalid Currency", expectedException.getMessage());
    }
}