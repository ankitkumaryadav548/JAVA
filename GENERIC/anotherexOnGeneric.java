// A company is building an online shopping system where different types of products are handled, such as:

// Product ID → Integer
// Product Name → String
// Price → Double

// The developer wants to create a flexible storage system that can hold any type of product detail without rewriting code for each data type.

// Task:
// Design a generic class Storage<T> that can:
// Store any type of product detail
// Provide methods to add (set) and retrieve (get) the value
// Create objects of the generic class to store:
// Product ID
// Product Name
// Price
// Show how your implementation:
// Eliminates the need for type casting
// Improves code reusability

class Storage<T> {
    private T data;

    // Method to set data
    public void setData(T data) {
        this.data = data;
    }

    // Method to get data
    public T getData() {
        return data;
    }
}

class Main{
    public static void main(String[] args) {

        // Store Product ID (Integer)
        Storage<Integer> productId = new Storage<>();
        productId.setData(101);

        // Store Product Name (String)
        Storage<String> productName = new Storage<>();
        productName.setData("Laptop");

        // Store Product Price (Double)
        Storage<Double> productPrice = new Storage<>();
        productPrice.setData(59999.99);

        // Display values
        System.out.println("Product ID: " + productId.getData());
        System.out.println("Product Name: " + productName.getData());
        System.out.println("Product Price: " + productPrice.getData());
    }
}