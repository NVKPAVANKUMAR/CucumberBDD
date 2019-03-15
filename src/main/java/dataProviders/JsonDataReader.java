package dataProviders;

import com.google.gson.Gson;
import testDataTypes.Customer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class JsonDataReader {
    private List<Customer> customerList;

    public JsonDataReader() {
        customerList = getCustomerData();
    }

    private List<Customer> getCustomerData() {
        Gson gson = new Gson();
        String customerFilePath = "C:\\Users\\pavan.nemalikanti\\IdeaProjects\\Cucumber-TestNG\\src\\main\\java\\testDataResource\\customer.json";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(customerFilePath))) {
            Customer[] customers = gson.fromJson(bufferedReader, Customer[].class);
            return Arrays.asList(customers);
        } catch (IOException e) {
            throw new RuntimeException("Json file not found at path : " + customerFilePath);
        }
    }

    public final Customer getCustomerByName(String customerName) {
        for (Customer customer : customerList) {
            if (customer.firstName.equalsIgnoreCase(customerName))
                return customer;
        }
        return null;
    }
}
