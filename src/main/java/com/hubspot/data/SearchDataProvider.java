package com.hubspot.data;

import org.testng.annotations.DataProvider;

public class SearchDataProvider{


    @DataProvider
    public static Object[][] dataProviderAsArray() {

        Object[][] data;

        data = new Object[][]{
                {"rose", "Send Roses: Rose Delivery & Rose Bouquets | 1800Flowers.com"},
                {"cactus", "Cacti, Terrariums & Succulents | Low Maintenance Plants | 1800flowers"},
                {"sunflower", "Send Sunflowers | Sunflower Bouquet Delivery | 1-800-FLOWERS.COM-10258"}
        };
        return data;
    }
}