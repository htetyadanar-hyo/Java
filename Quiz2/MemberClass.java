package InnerClasses.Quiz2;

public class MemberClass {
    class MyClassMember extends Vehicle {
        String modelName;

        MyClassMember(String name, String modelName) {
            super(name);
            this.modelName = modelName;
        }

        public String getModelName() {
            return modelName;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        @Override
        public void print(){
            System.out.println("Member Class Testing");
        }

    }
    public static void main(String[] args) {
        MemberClass mc = new MemberClass();
        MyClassMember m = mc.new MyClassMember("HH","H3");
        m.print();
    }
}

