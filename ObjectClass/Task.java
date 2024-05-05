package ObjectClass;

public abstract class Task {

    String name;
    public Task(String name){
        this.name = name;
    }

    public abstract void doSoe();
}

class MyTask extends Task{
    MyTask(String name){
        super(name);
    }

    @Override
    public void doSoe() {

    }
}