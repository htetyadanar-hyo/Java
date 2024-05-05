package InnerClasses.AnonymousClasses;

public class Test {

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Toyota"){
            String modelName = "Toyota Model";
            public String getModelName() {
                return modelName;
            }
            public void setModelName(String modelName) {
                this.modelName = modelName;
            }
            @Override
            public void printSomething() {
                System.out.println("Vehicle for Toyota Model");
            }
        };
        v1.printSomething();

        Vehicle v2 = new Vehicle("Mark II"){
            @Override
            public void printSomething() {
                System.out.println("Vehicle for Mark II");
            }
        };
        v2.printSomething();

        Vehicle v3 = new Vehicle("Toyota"){
            String modelName = "High Lander";
            public String getModelName() {
                return modelName;
            }
            public void setModelName(String modelName) {
                this.modelName = modelName;
            }
            @Override
            public void printSomething() {
                System.out.println("Vehicle for HighLander");
            }
        };
        v3.printSomething();

        //How to interface and anonymous class
        new Luxury() {
            @Override
            public boolean isLuxury() {
                return true;
            }
            @Override
            public void printSpecialFeatures() {
                System.out.println("2 Million");
            }
        };
    }
}
