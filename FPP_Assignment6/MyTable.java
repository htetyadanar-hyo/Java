package FPP_Assignment6;

public class MyTable{
    private Entry[] entries = new Entry[26];

    //returns the String that is matched with char c in the table
    public String get(char c){
        int charIndex = (int)c - 97;
        return entries[charIndex].getS();
    }
    //adds to the table a pair (c, s) so that s can be looked up using c
    public void add(char c, String s){
        int charIndex = (int)c - 97;
        Entry entry = new Entry(c,s);
        entries[charIndex] = entry;
    }
    //returns a String consisting of nicely formatted display
    //of the contents of the table
    public String toString(){
        //implement
        String result = "";
        for(Entry e: entries){
            if(e != null){
                result = result + e.toString() + "\n";
            }
        }
        return result;
    }
    class Entry{
        char c;
        String s;

        Entry(char c,String s){
            this.c = c;
            this.s = s;
        }

        public String getS() {
            return s;
        }

        //returns a String of the form "ch->str"
        public String toString(){
            return c + "->" + s;
        }
    }

    public static void main(String[] args) {
        MyTable t = new MyTable();
        t.add('a',"Andrew");
        t.add('b',"Billy");
        t.add('c',"Willie");
        System.out.println(t);

    }
}